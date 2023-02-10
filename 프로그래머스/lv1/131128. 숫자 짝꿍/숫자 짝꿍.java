import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xarr = new int[10];
        int[] yarr = new int[10];
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<X.length();i++){
           xarr[X.charAt(i)-'0']++;
        }
        for(int i=0;i<Y.length();i++){
           yarr[Y.charAt(i)-'0']++;
        }
        
        for (int i = xarr.length - 1; i >= 0; i--) {
            while (xarr[i] >= 1 && yarr[i] >= 1) {
                sb.append(i);
                xarr[i]--;
                yarr[i]--;
            }
        }

        
        
        if ("".equals(sb.toString())) {
            answer = "-1";
        } else if ("0".equals(sb.toString().substring(0,1))) {
            answer = "0";
        } else {
            answer = sb.toString();
        }

        return answer;
    }
}