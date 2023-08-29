class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int r=0, l=0;
        
        if(s.equals("")) return true;
        else if(t.equals("")) return false;
        else{
            while(r<len1 && l<len2){
            if(s.charAt(r)==t.charAt(l)) {
                r++;
            }
            l++;
        }
        
        }
        
        if(r==s.length()) return true;
        else return false;
    }
}