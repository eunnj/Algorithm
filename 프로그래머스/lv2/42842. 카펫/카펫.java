class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int num = brown + yellow;
        
        for(int i=1;i<=num;i++){
            int row = i;
            int col = num/i;
            
            if(row>col) continue;
            
            if((row-2)*(col-2)==yellow){
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }
       
        return answer;
    }
}