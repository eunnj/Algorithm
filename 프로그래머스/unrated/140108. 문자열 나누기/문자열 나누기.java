class Solution {
    public int solution(String s) {
        int answer = 0;
        int cnt1 = 1; // 같은 글자 수
        int cnt2 = 0; // 다른 글자 수
        char ch = s.charAt(0);
        
        for(int i=1;i<s.length();i++){
            if(ch==' ') ch=s.charAt(i);
            
            if(ch==s.charAt(i)){
                 cnt1++;
             }else{
                 cnt2++;
             }
            
            // System.out.println("cnt1: "+cnt1+" cnt2: "+cnt2);
            if(cnt1==cnt2){
                answer++;
                ch = ' ';
                
                cnt1=0;
                cnt2=0;
            }
            
        }
        
        if(cnt1!=cnt2) answer+=1;
        
        return answer;
    }
}