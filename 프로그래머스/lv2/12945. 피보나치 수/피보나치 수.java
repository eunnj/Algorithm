class Solution {
    public int solution(int n) {
        int answer = 0;
        int fib[] = new int[n+1];
        
        fib[0]=0;
        fib[1]=1;
        
        for(int i=2;i<=n;i++){
            fib[i]=((fib[i-2])%1234567+(fib[i-1])%1234567)%1234567;
        }
        
        answer=fib[n];
        
        return answer;
    }
}