package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bj_9012 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			String str = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			for(int j=0;j<str.length();j++) {
				char ch = str.charAt(j);
				
				if(ch=='(') stack.add(ch);
				else 
					{
					if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
					else stack.add(ch);
					}
			}
			
			if(!stack.isEmpty()) bw.write("NO\n");
			else  bw.write("YES\n");
		}
		
		br.close();
		bw.close();
	}
}
