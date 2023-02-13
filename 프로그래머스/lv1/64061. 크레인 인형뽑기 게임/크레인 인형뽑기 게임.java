import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int size = board[0].length;
        Stack<Integer> stack = new Stack();
        
        for(int i=0;i<moves.length;i++){
            int idx = moves[i]-1;
            for(int j=0;j<size;j++){
                 if(board[j][idx]==0) continue;
                 else{
                     if((!stack.isEmpty())&&(stack.peek()==board[j][idx])){
                         answer+=2;
                         stack.pop();
                     }else{
                         stack.add(board[j][idx]);
                     }
                     board[j][idx]=0;
                     break;
                 }
           }
            
        }
        
        return answer;
    }
}