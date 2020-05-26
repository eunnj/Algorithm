package baekjoon;

import java.util.Scanner;

public class bj_1010 {
public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
	
		int T =s.nextInt(); //테스트 케이스 개수
		
		for(int i=0;i<T;i++) {
			int N= s.nextInt();
			int M = s.nextInt();
			
			int dp[][] = new int[N+1][M+1];
			
			for(int n=2;n<=N;n++)
				dp[n][1]=0;
			
			for(int m=1;m<=M;m++)
				dp[1][m]=m;
			
			
			for(int x=2;x<=N;x++) {
				for(int y=2;y<=M;y++) {
					dp[x][y]=dp[x][y-1]+dp[x-1][y-1];
				}
			}
			
			System.out.println(dp[N][M]);
		}
		
		
	}
}
