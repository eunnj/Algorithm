class Solution {
    public String reverseWords(String s) {
        String[] word = s.strip().split(" ");
        String answer="";
        
        for(int i=word.length-1;i>=0;i--){
            if(!word[i].equals("")){
                if(i==0){
                    answer+=word[i];
                }
                else{
                    answer+=word[i]+" ";  
                }
            }
        }
        
        return answer;
    }
}