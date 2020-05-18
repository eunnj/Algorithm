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
				int r_next = j + graph[i][j]; 
				int l_next = i + graph[i][j];
				
				if(r_next<=N) dp[i][r_next]+=1;
				if(l_next<=N) dp[l_next][j]+=1;
			}
		}
			
		for(int i=1;i<=N;i++) 
			for(int j=1;j<=N;j++) 
				System.out.println(dp[i][j]);
	}
}
