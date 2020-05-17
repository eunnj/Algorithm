package baekjoon;

import java.util.Scanner;

public class bj_1932 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt(); //�ﰢ�� ũ��
		int dp[][] = new int[N+1][N+1]; //�� �ڸ� ��
		int max = 0;
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				dp[i][j] = s.nextInt();
			}
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) //���� �밢�� ��η� ������ ���
					dp[i][j]+=dp[i-1][1];
				else if (j==i) //������ �밢�� ��η� ������ ���
					dp[i][j]+=dp[i-1][j-1];
				else //�� �� ��� ����,������ �밢�� �� �� �� ū���� �����ش�.
					dp[i][j]+=Math.max(dp[i-1][j-1], dp[i-1][j]);
			}
		}
		
		for(int i=1;i<=N;i++) {
			 max = Math.max(max, dp[N][i]);
		}
		
		System.out.println(max);
	}
}
