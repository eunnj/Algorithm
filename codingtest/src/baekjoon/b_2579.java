package baekjoon;

import java.util.Scanner;

public class b_2579 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt(); 
		int dp[] = new int[N]; //ÃÖ´ñ°ª
		int score[] = new int[N]; //Á¡¼ö
		
		for(int i=0;i<N;i++) {
			score[i] = s.nextInt();
		}
		
		dp[0] = score[0];
		dp[1] = score[0] + score[1];
		dp[2] = Math.max(dp[1],dp[0]+score[2]);
		
		for(int i=3;i<N;i++) {
			dp[i] = Math.max(dp[i-3]+score[i-1]+score[i],dp[i-2]+score[i]);
			
		}
		
		System.out.print(dp[N-1]);
	}
}
