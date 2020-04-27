package baekjoon;

import java.util.Scanner;

public class b_2156 {
public static void main(String args[]) {
		
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		
		int dp[] = new int[N];
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			 arr[i] = s.nextInt();
		}
		
		 
		dp[0] = arr[0];
		dp[1] = dp[0] + arr[1];


		for(int i=3 ;i<N;i++) {
			int max1 = Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]);
			int max2 = Math.max(dp[i-1], dp[i]);
			
			dp[i] = Math.max(max1, max2);
		}
		
		System.out.println(dp[N-1]);
	}
}
