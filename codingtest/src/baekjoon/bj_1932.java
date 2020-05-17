package baekjoon;

import java.util.Scanner;

public class bj_1932 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt(); //삼각형 크기
		int dp[][] = new int[N+1][N+1]; //각 자리 수
		int max = 0;
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				dp[i][j] = s.nextInt();
			}
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) //왼쪽 대각성 경로로 내려올 경우
					dp[i][j]+=dp[i-1][1];
				else if (j==i) //오른쪽 대각선 경로로 내려올 경우
					dp[i][j]+=dp[i-1][j-1];
				else //그 외 경우 왼쪽,오른쪽 대각선 값 중 더 큰값을 더해준다.
					dp[i][j]+=Math.max(dp[i-1][j-1], dp[i-1][j]);
			}
		}
		
		for(int i=1;i<=N;i++) {
			 max = Math.max(max, dp[N][i]);
		}
		
		System.out.println(max);
	}
}
