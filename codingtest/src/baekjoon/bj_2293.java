package baekjoon;

import java.util.Scanner;

public class bj_2293 {
public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	int N = s.nextInt();
	int K = s.nextInt();
	
	int dp[] = new int[K+1];
	
	dp[0]=1;
	
	for(int i = 0; i < N; i++) {
		int coin = s.nextInt();
		for(int j = 1; j < K+1; j++) {
			if(j >= coin)
				dp[j] += dp[j - coin];
		}
	}
	System.out.println(dp[K]);
		
	}
}
