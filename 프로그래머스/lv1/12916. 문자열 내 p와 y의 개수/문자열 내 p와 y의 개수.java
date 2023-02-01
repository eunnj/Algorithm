class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt=0;
        int y_cnt=0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.toLowerCase(ch)=='p') p_cnt++;
            else if(Character.toLowerCase(ch)=='y') y_cnt++;
            else continue;
        }

        if(p_cnt!=y_cnt) answer=false;
        
        return answer;
    }
}