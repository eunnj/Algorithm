package baekjoon;

import java.util.Scanner;

public class bj_1890 {
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		
		int N = s. nextInt(); //게임판의 크기
		int graph[][] = new int[N+1][N+1]; //게임판
		int dp[][] = new int[N+1][N+1]; //경로의 수
		
		
		for(int i=1;i<=N;i++) 
			for(int j=1;j<=N;j++) 
				graph[i][j]=s.nextInt();
		
		dp[1][1]=1; //시작점 초기화
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if (i == N && j == N && graph[i][j]==0) break; //종착점에선 계산하지 않는다.
				else {        
				int right = j + graph[i][j]; 
				int down = i + graph[i][j];
				
				if(right<=N) dp[i][right]+=dp[i][j];
				if(down<=N) dp[down][j]+=dp[i][j];
				}
			}
		}
		
			System.out.println(dp[N][N]);
	}
}
