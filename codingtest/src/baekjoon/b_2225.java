package baekjoon;

import java.util.Scanner;

public class b_2225 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int K = s.nextInt();
		
		int dp[][] = new int[N+1][K+1];
		
		//√ ±‚»≠
		for(int i=0;i<=N;i++) {
			dp[i][0]=0;
		}
		for(int i=0;i<=K;i++) {
			dp[1][i]=0;
			dp[1][i]=1;
		}
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=K;j++) {
				dp[i][j]=(dp[i-1][j]+dp[i][j-1])%1000000000;
			}
		}
	
//		for(int i=1;i<=N;i++) {
//            for(int j=1;j<=K;j++) {
//                dp[i][j] = (dp[i][j-1]+ dp[i-1][j])%1000000000;
//            }
//        }
		
		System.out.println(dp[K][N]);
	}
}
