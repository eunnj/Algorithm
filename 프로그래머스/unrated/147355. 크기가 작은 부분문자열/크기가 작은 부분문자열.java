class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = p.length();
        long numP = Long.parseLong(p);
        for(int i=0;i<=t.length()-len;i++){
            long num = Long.parseLong(t.substring(i,i+len));
            if(num<=numP) answer++;
        }
        
        return answer;
    }
}