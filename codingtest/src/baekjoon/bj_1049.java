package baekjoon;

import java.util.Scanner;

public class bj_1049 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int M = s.nextInt();
		int min = 100000;
		
		int dp[][]=new int[M+1][N+1];
		int m[][]=new int[M+1][3];
		
		for(int i=1;i<=M;i++) {
			for(int j=1;j<3;j++) {
				m[i][j]=s.nextInt();
			}
		}
		
		for(int i=1;i<=M;i++) {
			for(int j=1;j<=N;j++) {
			if(j%6==0)
				dp[i][j]=Math.min((j/6)*m[i][1],dp[i][j-1]+m[i][2]);
			else
				dp[i][j]=Math.min(((j/6)+1)*m[i][1],dp[i][j-1]+m[i][2]);
			}
		}
		
		for(int i=1;i<=M;i++)
			min = Math.min(min,dp[i][N]);
		
		System.out.print(min);
	}
	
}
