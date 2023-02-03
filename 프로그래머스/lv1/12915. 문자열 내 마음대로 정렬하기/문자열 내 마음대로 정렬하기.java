import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer= new String[strings.length];
        
        String arr[] = new String[strings.length];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=strings[i].charAt(n)+strings[i];
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<answer.length;i++){
            answer[i]=arr[i].substring(1);
        }
        
        return answer;
    }
}