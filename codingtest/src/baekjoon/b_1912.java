package baekjoon;

import java.util.Scanner;

public class b_1912 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int arr[]= new int[N];
		int dp[]= new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		
		dp[0]=arr[0];
		int max=dp[0];
		
		for(int i=1;i<N;i++) {
			dp[i]=Math.max(dp[i-1]+arr[i], arr[i]);
			max=Math.max(max, dp[i]);
		}
		
		
		System.out.println(max);
	}
}
