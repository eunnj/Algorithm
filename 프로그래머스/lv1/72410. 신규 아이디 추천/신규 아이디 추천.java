class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1단계 - 소문자 변환
        answer = new_id.toLowerCase();
        
        // 2단계 - 소문자,숫자,-,_,. 제외 문자 제거
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        
        // 3단계 - 연속 문자열 치환
        answer = answer.replaceAll("[.]{2,}", ".");
        
        
        // 4단계 - 처음 마침표 제거
        if(answer.charAt(0)=='.') answer= answer.substring(1,answer.length());
        
        // 5단계 - 빈 문자열일 때 a 대입
        if (answer.equals("")) {    // 5단계
            answer += "a";
        }
        
        // 6단계 - 문자열 길이 제한
        if(answer.length()>15) {
            answer= answer.substring(0,15);
        }
        int len = answer.length()-1;
        if(answer.charAt(len)=='.') answer= answer.substring(0,len);
        
        // 7단계 - 문자열 2자리일 때
        if(answer.length()<3){
            if(answer.length()==1){
                while(answer.length()<3){
                    answer+=answer.charAt(0);
                }
            }
            else if(answer.length()==2){
                answer+=answer.charAt(1);
            }
        }
        
        return answer;
    }
}