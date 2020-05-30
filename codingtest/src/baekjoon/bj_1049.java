package baekjoon;

import java.util.Scanner;

public class bj_1049 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int M = s.nextInt();
		int Min = 100000;
		
		//int dp[][]=new int[M+1][N+1]; //�ּ� ���
		int m[][]=new int[M+1][3]; //�� �귣�� ��Ű�� ���ݰ� ���� ����
		int dp[]=new int[N+1];
		
		for(int i=1;i<=M;i++) {
			for(int j=1;j<3;j++) {
				m[i][j]=s.nextInt();
			}
		}
		
		int minP=100;
		int minO=100;
		
		for(int j=1;j<=M;j++) {
			minP=Math.min(minP,m[j][1]); //��Ű�� �ּ� �ݾ�
			minO=Math.min(minO,m[j][2]); //���� �ּ� �ݾ�
		}
		
//		//�ٸ� �귣���� ��Ÿ�ٵ� ����.. �����ʿ�
//		for(int i=1;i<=M;i++) {
//			for(int j=1;j<=N;j++) {
//			if(j%6==0)
//				dp[i][j]=Math.min((j/6)*m[i][1],dp[i][j-1]+m[i][2]);
//			else
//				dp[i][j]=Math.min(((j/6)+1)*m[i][1],dp[i][j-1]+m[i][2]);
//			}
//		}
//		
		for(int i=1;i<=N;i++) {
				
				dp[i]=Math.min(((i/6)+1)*minP,dp[i-1]+minO);
				dp[i]=Math.min(dp[i],(i/6)*minP+(i%6)*minO);
				
		}
		
		
//		//���� �� 6��¥�� �� ���� vs ���� �� ���� ���� vs (����� 6��¥�� �� + ����)
//        Min = Math.min(((N/6)+1)*minP, N*minO);    
//        Min = Math.min(Min, ((N/6))*minP + (N%6)*minO);
        
//		for(int i=1;i<=M;i++)
//			min = Math.min(min,dp[i][N]);
		
		System.out.print(dp[N]);
	}
	
}
