import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack();
		
		StringBuilder str = new StringBuilder();
		
		int idx=0;
		
		while(N>0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num>idx) {
				for(int i=idx+1;i<=num;i++) {
					stack.push(i);
					str.append("+\n");
				}
				idx=num;
			}
			else if(stack.peek() != num) {
				System.out.println("NO");
				return;		
			}
			
			stack.pop();
			str.append("-\n");
			N--;
		}
		System.out.println(str);
	}
}