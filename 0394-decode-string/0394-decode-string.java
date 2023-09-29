class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch == ']') {
                StringBuilder repeatStr = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    repeatStr.insert(0, stack.pop()); 
                }
                stack.pop(); 
                
                StringBuilder numStr = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    numStr.insert(0, stack.pop()); 
                }
                int repeatCount = Integer.parseInt(numStr.toString());
                
                
                for (int i = 0; i < repeatCount; i++) {
                    for (char c : repeatStr.toString().toCharArray()) {
                        stack.push(c);
                    }
                }
            } else {
                stack.push(ch);
            }
        }
        
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        
        return result.toString();
    }
}
