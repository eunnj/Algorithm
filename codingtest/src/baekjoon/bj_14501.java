package baekjoon;

import java.util.Scanner;

public class bj_14501 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		int time[] = new int[N+1]; //상담을 완료하는데 걸리는 기간
		int pay[] = new int[N+1]; //상담을 했을 때 받을 수 있는 금액
		int dp[] = new int[N+2]; //최대 이익
	
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
