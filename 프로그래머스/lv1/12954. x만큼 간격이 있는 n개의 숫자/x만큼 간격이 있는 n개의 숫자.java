class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0;i<n;i++){
            answer[i]=(i+1)*(long)x;
        }
        
        return answer;
    }
}