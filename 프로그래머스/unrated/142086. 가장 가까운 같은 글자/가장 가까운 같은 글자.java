class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=s.length()-1;i>=0;i--){
            answer[i]=-1;
            char ch1 = s.charAt(i);
            for(int j=i-1;j>=0;j--){
                char ch2 = s.charAt(j);
                if(ch1==ch2){
                    answer[i]=i-j;
                    break;
                }
            }
        }
        
        return answer;
    }
}