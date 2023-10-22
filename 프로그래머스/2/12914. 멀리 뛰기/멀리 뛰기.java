class Solution {
    public long solution(int n) {
        long answer = 0;
        long dp[] = new long[n+1];
        dp[0]=1;
        dp[1]=1;
        
        if(n>=2){
            for(int i=2;i<=n;i++){
                dp[i]=dp[i-2]+dp[i-1];
                dp[i]%=1234567;
            }
        }
        answer=dp[n];
        return answer;
    }
}