package baekjoon;

import java.util.Scanner;

public class b_2156 {
public static void main(String args[]) {
		
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		
		int dp[] = new int[N+1]; // 가장 많이 마실 수 있는 포도주 양
		int arr[] = new int[N+1]; //포도주의 양
		
		for(int i=1;i<=N;i++) {
			 arr[i] = s.nextInt();
		}
		
		
		dp[0]=0;
		dp[1] = arr[1];
		
		if(N>1) dp[2] = arr[1] + arr[2];

		for(int i=3 ;i<=N;i++) {
			dp[i] = Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]); //마지막 i잔을 마셨을 경우
			dp[i] = Math.max(dp[i-1], dp[i]); //포도주를 두 번 연속 안먹었을 경우, 마지막 잔 포도주를 마시지 않았을 경우
			
		}
		
		System.out.println(dp[N]);
	}
}
