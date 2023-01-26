class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = Integer.toBinaryString(n);
        int one_cnt=0; // 2진 변환 후 1의 개수
        int cnt=0; // 다음 큰 수의 1의 개수
        
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='1') one_cnt++;
        }
        
        while(cnt!=one_cnt){
            cnt=0;
            
            n++;
            s = Integer.toBinaryString(n);
            
            for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='1') cnt++;
            
        }
        
        answer=n;
       
        return answer;
    }
}