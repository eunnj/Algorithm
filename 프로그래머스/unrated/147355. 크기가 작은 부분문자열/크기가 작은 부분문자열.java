class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String str = "";
        long num_p = Long.parseLong(p);
        
        for(int i=0;i<=t.length()-p.length();i++){
            str=t.substring(i,i+p.length());
            long num_t = Long.parseLong(str);
            if(num_t<=num_p) answer++;
        }
        
        return answer;
    }
}