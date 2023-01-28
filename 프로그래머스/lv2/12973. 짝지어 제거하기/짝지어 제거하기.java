import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        stack.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.add(s.charAt(i));
            }
        }
       
        answer = stack.isEmpty() ? 1 : 0;
        
        return answer;
    }
}