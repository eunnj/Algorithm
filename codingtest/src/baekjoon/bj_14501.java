package baekjoon;

import java.util.Scanner;

public class bj_14501 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		int time[] = new int[N+1];
		int pay[] = new int[N+1];
		int dp[] = new int[N+1];
		int max=0;
		
		for(int i=1;i<=N;i++) {
			time[i]=s.nextInt();
			pay[i]=s.nextInt();
		}
		for(int i=1;i<=N;i++) {
			int index=i+time[i];
			
			while(index<N) {
				dp[i]+=pay[index];
				index+=time[index];
			}
			max=Math.max(max, dp[i]);
		}
		
		for(int i=1;i<=N;i++) {

			System.out.println(dp[i]);
		}
	}
}
