package baekjoon;

import java.util.Scanner;

public class bj_1965 {
	public static void main(String[] args ) {
		// LIS 
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		
		int size[] = new int[N+1];
		int dp[] = new int[N+1];
		
		int max=0;
		
		for(int i=1;i<=N;i++) {
			size[i]=s.nextInt();
			dp[i] = 1; //ÃÊ±âÈ­
		}
		
	
		for(int i=1;i<=N;i++) {
			for (int j = 1; j <= i; j++) {
				if (size[j] < size[i]) dp[i] = Math.max(dp[i], dp[j] + 1); 
			}
			 max = Math.max(max, dp[i]);
		}
		
		

		System.out.println(max);
	}
}
