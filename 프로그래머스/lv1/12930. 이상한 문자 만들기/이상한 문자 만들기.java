class Solution {
    public String solution(String s) {
        String answer = "";
        int n=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                answer+=" ";
                n=i+1;
            }
            else{
                if((i-n)%2!=0){
                answer+=Character.toLowerCase(s.charAt(i));
                }   
                else{
                    answer+=Character.toUpperCase(s.charAt(i));
                }
            }
            
        }
        
        return answer;
    }
}