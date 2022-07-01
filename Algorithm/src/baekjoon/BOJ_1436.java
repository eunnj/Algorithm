package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int number = 666;
		
		while(N!=count) {
			if(Integer.toString(number).contains("666")) {
				count++;
			}
			number++;
		}
		
		System.out.print(number-1);
	}
}
