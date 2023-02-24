import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0;i<s.length();i++){
            String str =s.substring(i,s.length())+s.substring(0,i);
            if(check(str)) answer++;
        }
        
        return answer;
    }
    
    boolean check(String str){
        boolean bool = false;
        Stack<Character> stack = new Stack();
        
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch=='['||ch=='('||ch=='{'){
                stack.add(ch);
            }else{
                if(!stack.isEmpty()){
                    if(ch==')' && stack.peek()=='('){
                        stack.pop();
                    }else if(ch==']' && stack.peek()=='['){
                        stack.pop();
                    }else if(ch=='}' && stack.peek()=='{'){
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }
            
        }
        
        
        if(stack.isEmpty()) bool = true;
        else bool = false;
        
        return bool;
    }
}