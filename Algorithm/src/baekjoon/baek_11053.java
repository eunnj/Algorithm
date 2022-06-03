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
		
		for (int i = 1; i <= N; i++) {
	        dp[i] = 1;
	        for (int j = 1; j <= i; j++) {
	            if (arr[i] > arr[j] && dp[j] + 1 > dp[i]) dp[i] = dp[j] + 1;
	        }
	    }
		
		int max =0 ;
		
		for(int i=1;i<=N;i++) {
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
	}
}
