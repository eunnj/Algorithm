class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        while(n!=1){
            if(n%2==0){
                n/=2;
            }else{
                n=n*3+1;
            }
            
            answer++;
            if(n==1) break;
            
            
        }
        
        if(answer>=500)  return -1;
        else return answer;
    }
}