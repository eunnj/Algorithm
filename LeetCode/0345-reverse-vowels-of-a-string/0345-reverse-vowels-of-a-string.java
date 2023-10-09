class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        String str = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
              ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                list.add(ch);
            }  
        }
        
        int idx=1;
        int len=list.size();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
              ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                str+=list.get(len-idx);
                idx++;
            }else{
                str+=ch;
            }
        }
        return str;
    }
}