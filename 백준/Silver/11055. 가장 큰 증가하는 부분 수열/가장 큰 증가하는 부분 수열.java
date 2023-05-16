
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		
		int arr[] = new int[N];
		int dp[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		
		dp[0]=arr[0];
		int result=dp[0];
		if(N>0) {
			for(int i=1;i<N;i++) {
				dp[i]=arr[i];
				for(int j=0;j<i;j++) {
					if(arr[j]<arr[i])
						dp[i]=Math.max(dp[i], arr[i]+dp[j]);
				}
				result = Math.max(result, dp[i]);
			}
		}
		
		System.out.print(result);
	}
}
