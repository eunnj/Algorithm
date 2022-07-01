package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1085 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int w = Integer.parseInt(str[2]);
		int h = Integer.parseInt(str[3]);
		
		int min1 = Math.min(x,w-x);
		int min2 = Math.min(y,h-y);
		
		int min = Math.min(min1, min2);
		
		System.out.print(min);
	}
}
