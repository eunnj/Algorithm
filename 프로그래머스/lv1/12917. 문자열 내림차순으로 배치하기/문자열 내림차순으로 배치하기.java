import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int arr[] = new int[s.length()];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)s.charAt(i);
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++)
            answer+=(char)arr[arr.length-i-1];
        
        return answer;
    }
}