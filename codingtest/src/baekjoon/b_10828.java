package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


public class b_10828 {

	public static void main(String[] args) throws IOException{
		Scanner s= new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
			case "push" :
				int x = Integer.parseInt(str[1]);
				stack.push(x);
				break;
			case "pop":
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.isEmpty()) System.out.println("1");
				else System.out.println("0");
				break;
			case "top":
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.peek());
				break;
			}
		}
		
	}
}
