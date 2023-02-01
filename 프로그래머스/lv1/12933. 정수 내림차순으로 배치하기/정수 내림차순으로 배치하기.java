import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        long arr[] = new long[str.length()];
        
       
        for(int i=0;i<arr.length;i++){
            arr[i] = (long)(str.charAt(i)-'0');
        }
        
        Arrays.sort(arr);
        str="";
        for(int i=0;i<arr.length;i++){
            str+=arr[arr.length-i-1];
        }
        answer = Long.parseLong(str);
        return answer;
    }
}