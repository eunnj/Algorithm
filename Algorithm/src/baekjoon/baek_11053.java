package baekjoon;

import java.util.Scanner;

public class baek_11053 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int arr[] = new int[N+1];
		int dp[] = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			arr[i] = s.nextInt();
		}
		
		dp[1]=1;
		

		for(int i=2;i<=N;i++) {
			if(arr[i-1]<arr[i]) {
				dp[i]=(dp[i-1]+1);
			}
			else dp[i]=dp[i-1];
		}
		
		
		for(int i=1; i<=N; i++) {
			System.out.println(dp[i]);

		}
	
		//System.out.println(dp[N]);
	}
}
