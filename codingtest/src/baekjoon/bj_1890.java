package baekjoon;

import java.util.Scanner;

public class bj_1890 {
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		
		int N = s. nextInt(); //�������� ũ��
		int graph[][] = new int[N+1][N+1]; //������
		int dp[][] = new int[N+1][N+1]; //����� ��
		
		
		for(int i=1;i<=N;i++) 
			for(int j=1;j<=N;j++) 
				graph[i][j]=s.nextInt();
		
		dp[1][1]=1; //������ �ʱ�ȭ
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if (i == N && j == N && graph[i][j]==0) break; //���������� ������� �ʴ´�.
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
