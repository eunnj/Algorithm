class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;
        
        for(int i=3;i<=sum;i++){
            int col = i;
            int row = sum/i; 
            
            if(col>row) continue;
            if((col-2)*(row-2)==yellow){
                answer[0]=row;
                answer[1]=col;
                return answer;
            }
        }
        return answer;
    }
}