package baekjoon;

import java.util.Scanner;
import java.util.Stack;


public class b_10828 {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int N= s.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<N;i++) {
			String order=s.next();
			
			switch(order) {
			case "push":
				int x = s.nextInt();
				 stack.push(x);
				break;
			case "pop":
				if(stack.isEmpty()) System.out.print(-1);
				else  System.out.print(stack.pop());
				break;
			case "size":
				 System.out.print(stack.size());
				break;
			case "top":
				if(stack.isEmpty()) System.out.print(-1);
				else  System.out.print(stack.peek());
				break;
			case "empty":
				if(stack.isEmpty()) System.out.print(1);
				else  System.out.print(0);
				break;
			}
		}
	}
}
