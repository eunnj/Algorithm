class Solution {
    public int[] solution(long n) {
      
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            answer[i]=str.charAt(str.length()-i-1)-'0';
        }
        
        return answer;
    }
}