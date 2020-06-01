package baekjoon;

import java.util.Scanner;

public class bj_1965 {
	public static void main(String[] args ) {
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		
		int size[] = new int[N+2];
		int dp[] = new int[N+2];
		
		int max=0;
		
		for(int i=1;i<=N;i++) {
			size[i]=s.nextInt();
		}
		
		for(int i=N;i>=1;i--) {
			for(int j=N;j>=1;j--) {
				if(size[j]>=size[j-1]) dp[i]++;
				
				if(dp[i]>dp[i+1]) max = dp[i];
				else max = dp[i+1];
			
			}
		}
		
		System.out.print(max);
	}
}
