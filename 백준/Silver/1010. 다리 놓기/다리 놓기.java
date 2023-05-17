import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			String str[] = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			
			int dp[][] = new int[N+1][M+1];
			
			for(int j=0;j<=N;j++) {
				dp[j][0]=0;
			}
			
			for(int j=1;j<=M;j++) {
				dp[1][j]=j;
			}
			
			for(int x=2;x<=N;x++) {
				for(int y=2;y<=M;y++) {
					dp[x][y]=dp[x][y-1]+dp[x-1][y-1];
				}
			}
			System.out.println(dp[N][M]);
		}
	}
}
