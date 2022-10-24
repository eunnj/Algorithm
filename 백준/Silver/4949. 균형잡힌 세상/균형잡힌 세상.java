import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			while(true) {
				
				String str = br.readLine();
				
				if(str.equals(".")) {
					break;
				}
				
				
				boolean answer = isBalance(str);
				
				if(answer==false) {
					System.out.println("no");
				}else {
					System.out.println("yes");
				}
				
			}
		
	}

		private static boolean isBalance(String str) {
			Stack<Character> stack = new Stack<>();
			boolean ret = true;
			
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch=='(' || ch=='[') {
					stack.add(ch);
				}
				else if(ch==')') {
					if(!stack.isEmpty() &&
							stack.peek()=='(') stack.pop();
					else {
						return false;
					};
				}
				else if(ch==']') {
					if(!stack.isEmpty() && stack.peek()=='[') stack.pop();
					else {
						return false;
					}
				}
				else {
					continue;
				}
				
			}
			
			if(stack.isEmpty() && ret == true) {
				return true;
			}
			else {
				return false;
			}
		}

}