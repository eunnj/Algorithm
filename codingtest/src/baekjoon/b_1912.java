package baekjoon;

import java.util.Scanner;

public class b_1912 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int arr[]= new int[N+1];
		int dp[]= new int[N+1];
		
		for(int i=1;i<=N;i++) {
			arr[i]=s.nextInt();
		}
		
		int max = dp[1];
		
		
		for(int i=1;i<=N;i++) {
			dp[i] += Math.max(max, arr[i]);
		}
		
		
		System.out.println(max);
	}
}
