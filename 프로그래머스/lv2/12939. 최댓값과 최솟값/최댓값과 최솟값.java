class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split(" ");
        int min=Integer.parseInt(str[0]);
        int max=Integer.parseInt(str[0]);
        
        
        for(int i=0;i<str.length;i++){
           int num = Integer.parseInt(str[i]);
           min = Math.min(min,num);
           max = Math.max(max,num);
        }
        
        answer = min+" "+max;
        return answer;
    }
}