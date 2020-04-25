package baekjoon;

import java.util.Scanner;

public class baek_1149 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt(); //집의 수
		//int graph[][] = new int[3][N];
		int dp[][] = new int[3][N];
		
		for(int i=0;i<N;i++) { 
			for(int j=0;j<3;j++) {//RGB
				dp[i][j]=s.nextInt();	
			}
		}
		
		
		for(int i=1;i<N;i++) { //dp[0]은 초기화 상태로 같으므로 생략하고 1부터 시작
			for(int j=0;j<3;j++) {
				if(j==0) dp[i][j] += Math.min(dp[i-1][j+1], dp[i-1][j+2]);
				else if(j==1) dp[i][j] += Math.min(dp[i-1][j+1], dp[i-1][j-1]);
				else dp[i][j] += Math.min(dp[i-1][j-1], dp[i-1][j-2]);
				
			}
		}
		
		int min = 1000;
		
		for(int i=0;i<3;i++) {
			min = Math.min(min, dp[N-1][i]);
			
		}
		/*
		
		for(int i=0;i<N;i++) { 
			for(int j=0;j<3;j++) {//RGB
				System.out.println(dp[i][j]);
			}
			System.out.println();
		}
	*/
		System.out.println(min);
		
		
	}
}
