class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String str = "abcdefghijklmnopqrstuvwxyz";
        
        for(int j=0;j<skip.length();j++){
            str = str.replace(skip.charAt(j)+"","");
        }
        
        for(int i=0;i<s.length();i++){
            int idx = str.indexOf(s.charAt(i)+"");
            idx += index;
            while(idx>str.length()-1){
                idx-=str.length();
            }
            answer+=str.charAt(idx);
        }
        
        return answer;
    }
}