package baekjoon;

import java.util.Scanner;
import java.util.Stack;


public class b_10828 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int N= s.nextInt();
		
		for(int i=0;i<N;i++) {
			String order=s.next();
			
			switch(order) {
			case "push":
				int x = s.nextInt();
				 stack.push(x);
				break;
			case "pop":
				if(stack.isEmpty()) System.out.println(-1);
				else  System.out.println(stack.pop());
				break;
			case "size":
				 System.out.println(stack.size());
				break;
			case "top":
				if(stack.isEmpty()) System.out.println(-1);
				else  System.out.println(stack.peek());
				break;
			case "empty":
				if(stack.isEmpty()) System.out.println(1);
				else  System.out.println(0);
				break;
			}
		}
	}
}
