package baekjoon;

import java.util.Scanner;

public class baek_1149 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt(); //���� ��
		int dp[][] = new int[3][N];
		
		for(int i=0;i<N;i++) { 
			for(int j=0;j<3;j++) {//RGB
				dp[i][j]=s.nextInt();	
			}
		}
		
		
		for(int i=1;i<N;i++) { //dp[0]�� �ʱ�ȭ ���·� �����Ƿ� �����ϰ� 1���� ����
			 dp[i][0] += Math.min(dp[i-1][1], dp[i-1][2]);
			 dp[i][1] += Math.min(dp[i-1][0], dp[i-1][2]);
			 dp[i][2] += Math.min(dp[i-1][0], dp[i-1][1]);
		}
		
		int min = 100000;
		
		for(int i=0;i<3;i++) {
			min = Math.min(min, dp[N-1][i]);
		}
		
		System.out.println(min);

	}
}
