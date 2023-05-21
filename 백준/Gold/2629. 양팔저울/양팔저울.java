import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean dp[][] ;
	public static int arr1[];
	public static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine()); // 추의 개수 
		arr1 = new int[N]; // 추의 무게 
		String str[] = br.readLine().split(" ");
		for(int i=0;i<N;i++) {
			arr1[i]=Integer.parseInt(str[i]);
		}
		

		dp= new boolean[N+1][40001]; // 판별 가능한 무게  
		
		dfs(0,0);
		
		
		int M = Integer.parseInt(br.readLine()); //구슬의 개수 
		String str2[] = br.readLine().split(" ");
		String answer = "";
		
		for(int i=0;i<M;i++) {
			int ret =Integer.parseInt(str2[i]);
			if(dp[N][ret]) answer+="Y ";
			else answer+="N ";
		}
		
		System.out.print(answer);
		
	}
	
	public static void dfs(int cnt, int sum) {
		if(sum>500*30 || dp[cnt][sum]) return;
		
		dp[cnt][sum]=true;
		
		if(cnt==N) return;
		
		dfs(cnt+1,sum+arr1[cnt]);
		dfs(cnt+1,sum);
		dfs(cnt+1,Math.abs(sum-arr1[cnt]));
		
		
	}
}
