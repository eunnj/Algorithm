class Solution {
    public int solution(int n) {
        int answer = 0;
        int f[] = new int[n+1];
        
        f[0]=0;
        f[1]=1;
        
        for(int i=2;i<=n;i++){
            f[i]=(f[i-2]+f[i-1])%1234567;
        }
       
        answer = f[n]%1234567;
        return answer;
    }
    
}