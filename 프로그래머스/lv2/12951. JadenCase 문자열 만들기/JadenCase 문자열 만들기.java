class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        boolean flag = true;
        
        for(int i=0;i<str.length;i++){
            if(flag){
                answer += str[i].toUpperCase();
            }else{
                answer += str[i].toLowerCase();
            } 
            
            flag = str[i].equals(" ") ? true : false; 
        }
        
        return answer;
    }
}