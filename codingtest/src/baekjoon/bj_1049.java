package baekjoon;

import java.util.Scanner;

public class bj_1049 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int M = s.nextInt();
		int min = 100000;
		
		//int dp[][]=new int[M+1][N+1]; //최소 비용
		int m[][]=new int[M+1][3]; //각 브랜드 패키지 가격과 낱개 가격
		int dp[]=new int[N+1];
		
		for(int i=1;i<=M;i++) {
			for(int j=1;j<3;j++) {
				m[i][j]=s.nextInt();
			}
		}
		
		int min6=100;
		int min1=100;
		
		for(int j=1;j<=M;j++) {
			min6=Math.min(min6,m[j][1]);
			min1=Math.min(min6,m[j][2]);
		}
		
//		//다른 브랜드의 기타줄도 가능.. 수정필요
//		for(int i=1;i<=M;i++) {
//			for(int j=1;j<=N;j++) {
//			if(j%6==0)
//				dp[i][j]=Math.min((j/6)*m[i][1],dp[i][j-1]+m[i][2]);
//			else
//				dp[i][j]=Math.min(((j/6)+1)*m[i][1],dp[i][j-1]+m[i][2]);
//			}
//		}
//		
		for(int i=1;i<=N;i++) {
			if(i%6==0)
				dp[i]=Math.min((i/6)*min6,dp[i-1]+min1);
			else
				dp[i]=Math.min(((i/6)+1)*min6,dp[i-1]+min1);
				
		}
		
		
//		for(int i=1;i<=M;i++)
//			min = Math.min(min,dp[i][N]);
		
		System.out.print(dp[N]);
	}
	
}
