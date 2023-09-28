class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        stack.add(asteroids[0]);
        
        for(int i=1;i<asteroids.length;i++){
            int n = asteroids[i];
            if(n>0) stack.add(n);
            else{
                 while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -n)
                    stack.pop();
                if (stack.isEmpty() || stack.peek() < 0)
                    stack.push(n);
                if (stack.peek() == -n)
                    stack.pop();
            }
        }
        
        
        int[] ans = new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            ans[i]=stack.get(i);
        }
        return ans;
    }
}