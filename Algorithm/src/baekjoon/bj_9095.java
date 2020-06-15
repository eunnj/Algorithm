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
		
		for(int i=3;i<12;i++) {
			for(int j=1;j<i;j++) {
				dp[i]+=dp[j];
			}
		}
		
		for(int i=0;i<T;i++) {
			int N = s.nextInt();
			System.out.println(dp[N]);
		}
		
	}
}
