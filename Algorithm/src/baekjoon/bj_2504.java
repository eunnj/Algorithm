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
			
			if(ch=='(') {
				stack.push(ch);
				ret*=2;
			}else if(ch== '['){
				stack.push(ch);
				ret*=3;
			}else if(ch==')') {
				if(stack.isEmpty()||stack.peek()!='(') {
					total=0;
					break;
				}
				if(str.charAt(i-1)=='(') {
					total+=ret;
				}
				stack.pop();
				ret/=2;
			}else if(ch==']') {
				if(stack.isEmpty()||stack.peek()!='[') {
					total=0;
					break;
				}
				if(str.charAt(i-1)=='[') {
					total+=ret;
				}
				stack.pop();
				ret/=3;
			}
			
		}
		System.out.println(!stack.isEmpty() ? 0 : total);
	}
}
