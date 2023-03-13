class Solution {
    public int solution(int n) {
        int answer = 0;
        int dp[] = new int[n];
        
        dp[0]=1;
        
        if(n>1){
            
            dp[1]=2;
            for(int i=2;i<n;i++){
                dp[i]=(dp[i-2]+dp[i-1])%1000000007;
            }
        }
        
        
        answer = dp[n-1];
        return answer;
    }
}