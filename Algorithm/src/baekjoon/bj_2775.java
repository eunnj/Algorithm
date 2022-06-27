package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2775 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int dp[][] = new int[15][15];
		
		
		for(int j=1;j<15;j++) {
				dp[0][j]=j;
				dp[j][1]=1;
		}
		
		for(int i=1;i<15;i++)
			for(int j=2;j<15;j++)
				dp[i][j]=dp[i][j-1]+dp[i-1][j];
		
		for(int i=0;i<T;i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp[k][n]);
			
		}
	}
}
