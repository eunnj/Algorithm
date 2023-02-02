class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        while(n>0){
            str += Integer.toString(n%3);
            n/=3;
        }
        
        
        answer = Integer.parseInt(str,3);
        
        return answer;
    }
}