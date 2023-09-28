class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                stack.pop();
            }else{
                stack.add(ch);
            }
        }
        
        for(int i=0;i<stack.size();i++){
            ans+=stack.get(i);
        }
        
        return ans;
    }
}