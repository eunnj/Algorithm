package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class bj_11724 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt(); //������ ����
		int M = s.nextInt(); //������ ����
		
		ArrayList<Integer> nodes[]= new ArrayList[N+1];
		boolean check[] =new boolean[N+1];
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(1);
		
		while(!stack.isEmpty()) {
			int current = stack.pop();
			
			if(check[current]==false) {
				check[current]=true;
				System.out.print(current+" ");
				
				
				for(int i:nodes[current]) {
					if (check[i]==false)
						dfs(i);
				}
			}
			
		}
	}
}
