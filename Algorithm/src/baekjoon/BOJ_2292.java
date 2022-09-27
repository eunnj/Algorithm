package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result =1;
		int i=1;
		
		while(true) {
			if(result>=N) break;
			else{
				result+=i*6;
				i++;
			}
		}
		
		System.out.print(i);
	}
}
