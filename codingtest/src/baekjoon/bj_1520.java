package baekjoon;

import java.util.Scanner;

public class bj_1520 {
	static int dp[][];
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
				dp[i][j] = -1; //방문 여부 check (1<->0)
			}
		}
		
		System.out.println(dfs(1,1));
	}
	
	public static int dfs(int x,int y) {
		int move_x[] = {1,0,-1,0};
		int move_y[] = {0,1,0,-1};
		
		if(x==M && y==N) return 1;
		if (dp[y][x]==0) return dp[y][x];
		
		if(dp[y][x]==-1) {
			dp[y][x]=0; 
		
			for(int i=0;i<move_x.length;i++) {
				int nx=x+move_x[i];
				int ny=y+move_x[y];
				if(map[ny][nx]<map[y][x]&&ny>0&&ny<=M&&nx>0&&nx<=N)
					dp[y][x]+=dfs(nx,ny);
			}
		}
		
		return dp[y][x];
	}
}
