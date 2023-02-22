class Solution {
    public long solution(int n) {
        long answer = 0;
        long num[] = new long[n];
        
        if(n==1){
            return 1;
        }else{
            num[0]=1;
            num[1]=2;
            for(int i=2;i<n;i++){
                num[i]=(num[i-2]+num[i-1])%1234567;   
            }
            answer=num[n-1];
        }
        
        return answer;
    }
}