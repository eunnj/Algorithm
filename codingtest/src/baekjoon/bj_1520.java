package baekjoon;

import java.util.Scanner;

public class bj_1520 {
	static int dp[][]; //경로 개수
	static int map[][];
	static int M,N;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		 M = s.nextInt(); //세로
		 N = s.nextInt(); //가로
		map = new int[501][501];
		dp = new int[501][501];
		
		for(int i=1 ;i<=M;i++) {
			for(int j=1;j<=N;j++) {
				map[i][j]=s.nextInt();
				dp[i][j] = -1; //방문 여부 check (-1<->0)
			}
		}
		
		System.out.println(dfs(1,1));
	}
	
	public static int dfs(int x,int y) {
		int move_x[] = {1,0,-1,0};
		int move_y[] = {0,1,0,-1};
		
		if(x==M && y==N) return 1; //도착점
		if(dp[x][y] != -1) return dp[x][y]; //방문한 적이 있다면
		
		if(dp[x][y] == -1) {
			dp[x][y] = 0; //방문 여부 표시
		
			for(int i=0;i<move_x.length;i++) {
				int nx = x + move_x[i];
				int ny = y + move_y[i];
				
				if(nx>0 && nx<=M && ny>0 && ny<=N) {
					if(map[x][y]>map[nx][ny])
						dp[x][y]+=dfs(nx,ny);
				}
			}
		}
		
		return dp[x][y];
	}
}
