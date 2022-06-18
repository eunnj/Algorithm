package baekjoon;
import java.util.Scanner;
import java.util.Stack;

public class bj_2504 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		int ret=1;
		int total =0;
		String str = s.next();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			switch(ch) {
			case '(':
				stack.push(ch);
				ret*=2;
				break;
			case '[':
				stack.push(ch);
				ret*=3;
				break;
			case ')':
				if(stack.isEmpty()||stack.peek()!='(') {
					System.out.print(0);
					return;
				} else if (str.charAt(i - 1) == '(') {
                    total += ret;
                }
                stack.pop();
                ret /= 2;
                break;
			case ']':
				if(stack.isEmpty()||stack.peek()!='[') {
					System.out.print(0);
					return;
				} else if (str.charAt(i - 1) == '[') {
                    total += ret;
                }
                stack.pop();
                ret /= 3;
                break;
			}
			
		}
		System.out.print(total);
	}
}
