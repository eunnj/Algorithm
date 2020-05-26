package baekjoon;

import java.util.Scanner;

public class bj_11727 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		int dp[] = new int[1001]; // (1 ¡Â n ¡Â 1,000)
		
		dp[1]=1;
		dp[2]=3;
		
		for(int i=3;i<=N;i++) {
			dp[i]=(dp[i-1]+2*dp[i-2])%10007;
			
		}
		
		System.out.println(dp[N]);
	}
}
