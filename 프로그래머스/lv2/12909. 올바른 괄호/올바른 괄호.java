import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.add(ch);
            }else{
                if(stack.isEmpty()) return answer;
                else stack.pop();
            }
        }

        answer =  stack.isEmpty() ? true:false;
        return answer;
    }
}