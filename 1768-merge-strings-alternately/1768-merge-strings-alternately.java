class Solution {
    public String mergeAlternately(String word1, String word2) {
            int len1 = word1.length();
            int len2 = word2.length();

            int l = Math.min(len1,len2);

            String str = "";
            for(int i=0;i<l;i++){
                str+=word1.charAt(i);
                str+=word2.charAt(i);
            }

            if(len1<len2){
                str+=word2.substring(l,len2);
            }else{
                str+=word1.substring(l,len1);
            }
            return str;
    }
}