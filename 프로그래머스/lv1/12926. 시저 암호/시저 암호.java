class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
       
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int num = ch-0+n;
            // 소문자일 때
            if(ch>='a'&&ch<='z'){
                answer+=(char)((ch-'a'+n)%26 + 'a');
            }
            // 대문자일 때
            else if(ch>='A'&&ch<='Z'){
                answer+=(char)((ch-'A'+n)%26 + 'A');
            }
            // 공백일 때
            if(ch==' ') {
                answer+=" ";
                continue;
            }

        }
        
        
        return answer;
    }
}