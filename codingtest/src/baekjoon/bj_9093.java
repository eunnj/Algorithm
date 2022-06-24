package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class bj_9093 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			String str[] = br.readLine().split(" ");
			for(int j=0;j<str.length;j++) {
				Stack<Character> stack = new Stack();
				for(int x=0;x<str[j].length();x++) {
					stack.add(str[j].charAt(x));
				}
				for(int x=0;x<str[j].length();x++) {
					bw.write(stack.pop());
				}
				bw.write(" ");
			}
			bw.write("\n");
		}
		
		
		br.close();
		bw.close();
	}
}
