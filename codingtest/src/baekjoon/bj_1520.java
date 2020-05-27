package baekjoon;

import java.util.Scanner;

public class bj_1520 {
	static int dp[][]; //��� ����
	static int map[][];
	static int M,N;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		 M = s.nextInt(); //����
		 N = s.nextInt(); //����
		map = new int[501][501];
		dp = new int[501][501];
		
		for(int i=1 ;i<=M;i++) {
			for(int j=1;j<=N;j++) {
				map[i][j]=s.nextInt();
				dp[i][j] = -1; //�湮 ���� check (-1<->0)
			}
		}
		
		System.out.println(dfs(1,1));
	}
	
	public static int dfs(int x,int y) {
		int move_x[] = {1,0,-1,0};
		int move_y[] = {0,1,0,-1};
		
		if(x==M && y==N) return 1; //������
		if(dp[x][y] != -1) return dp[x][y]; //�湮�� ���� �ִٸ�
		
		if(dp[x][y] == -1) {
			dp[x][y] = 0; //�湮 ���� ǥ��
		
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
