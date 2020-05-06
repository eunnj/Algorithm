package baekjoon;

import java.util.Scanner;

public class bj_11726 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		
		int dp[] = new int[N+1];
		
		dp[0]=0;
		
		if(N>=1) dp[1]=2;
			
			
		for(int i=2;i<=N;i++) {
			dp[i]= (dp[i-1]+dp[i-2]) % 10007;
		}
		
		
		System.out.println(dp[N]);
		
	}
}
