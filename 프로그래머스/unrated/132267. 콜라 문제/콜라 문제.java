class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n>=a){
            int cnt = n/a*b;
            int remain = n%a;
            answer+=cnt;
            n=cnt+remain;
        }
        
        
        
        
        return answer;
    }
}