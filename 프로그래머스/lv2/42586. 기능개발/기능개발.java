import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<progresses.length;i++){
            que.add((int)Math.ceil((double)(100-progresses[i])/(double)speeds[i]));
        }
        
        while(!que.isEmpty()){
            int day = que.poll();
            int cnt = 1;
            
             while(!que.isEmpty() && day >= que.peek()){
                cnt++;
                que.poll();
            }
            list.add(cnt);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}