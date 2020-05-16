package baekjoon;

import java.util.Scanner;

public class bj_14501 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		int time[] = new int[N+1];
		int pay[] = new int[N+1];
		int dp[] = new int[N+2];
	
		for(int i=1;i<=N;i++) {
			time[i]=s.nextInt();
			pay[i]=s.nextInt();
		}
		
		for(int i=N;i>0;i--) {
			int index=i+time[i];
			
			if(index >N+1) 
				dp[i]=dp[i+1];
			else
				dp[i]=Math.max(dp[i+1],pay[i]+dp[index]);
			
		}
		
			System.out.println(dp[1]);
		
	}
}
