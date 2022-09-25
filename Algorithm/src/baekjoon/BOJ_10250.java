package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10250 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		 for(int i=0;i<T;i++) {
			String str[] =br.readLine().split(" ");
			
			int H = Integer.parseInt(str[0]);
			int W = Integer.parseInt(str[1]);
			int N = Integer.parseInt(str[2]);
			
			int answer;
			if(N%H==0) {
				answer= H * 100 + N / H;
			}else {
				answer = (N % H) * 100 + (N / H) + 1;
			}
			System.out.println(answer);
			
		} 
		
	}
}
