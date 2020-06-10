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
		
		//dp[1]=1;
		
		//int num=dp[1];
		
//		for(int i=2;i<=N;i++) {
//			if(num<arr[i]) {
//				dp[i]=(dp[i-1]+1);
//				num=arr[i];
//			}
//			else dp[i]=dp[i-1];
////			System.out.println(num);
//		}
		
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
		
//		
//		for(int i=1; i<=N; i++) {
//			System.out.println(dp[i]);
//
//		}
	
		System.out.println(max);
	}
}
