class Solution {
    public String solution(String s) {
        String answer = "";
        String strarr[] = s.split(" ");
        int intarr[] = new int[strarr.length];
        
        
        for(int i=0;i<strarr.length;i++){
            intarr[i]=Integer.parseInt(strarr[i]);
        }
        
        int max=intarr[0];
        int min=intarr[0];
        for(int i=1;i<intarr.length;i++){
            max=Math.max(max,intarr[i]);
            min=Math.min(min,intarr[i]);
        }
        
        answer=min+" "+max;
        return answer;
    }
}