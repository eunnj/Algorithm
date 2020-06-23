package baekjoon;

import java.util.Scanner;

public class bj_9095 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int T = s.nextInt();
		int dp[] = new int[12];

		//√ ±‚»≠
		dp[1]=1; //1
		dp[2]=2; //1+1,2
		dp[3]=4;//1+1+1,2+1,1+2,3
		
		for(int i=4;i<12;i++) {
			dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
		}
		
		for(int i=0;i<T;i++) {
			int N = s.nextInt();
			System.out.println(dp[N]);
		}
		
	}
}
