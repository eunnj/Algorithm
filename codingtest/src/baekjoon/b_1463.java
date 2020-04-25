package baekjoon;

import java.util.Scanner;

public class b_1463 {
	public static void main(String args[]) {
		
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		int dp[]= new int[N+1];
		
		dp[0]=0; dp[1]=0; //√ ±‚»≠
		
		
		for(int i=2;i<=N;i++) {
			
			if(i/3==0 && i/2==0) {
				dp[i] = Math.min(dp[i/3], Math.min(dp[i-1], dp[i-2]))+1;
			}
			else if(i%3==0) {
				dp[i]=Math.min(dp[i/3],dp[i-1])+1;
			}else if(i%2==0) {
				dp[i]=Math.min(dp[i/2], dp[i-1])+1;
			}else {
				dp[i]=dp[i-1]+1;
			}
		}
		
		System.out.println(dp[N]);
	}
}
