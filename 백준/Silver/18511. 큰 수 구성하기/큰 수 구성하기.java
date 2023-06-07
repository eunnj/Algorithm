
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int N,K,ans;
	static int arr[];
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		K = Integer.parseInt(str[1]);
		
		arr = new int[K];
		String[] str_num = br.readLine().split(" ");
		
		for(int i=0;i<K;i++)
			arr[i]=Integer.parseInt(str_num[i]);
		
		// Arrays.sort(arr);
		dfs(0);
		System.out.println(ans);
	
	}
	
	private static void dfs(int now) {
		if(now>N) return;
		
		if(ans<now) ans=now;
		
		for (int i = K-1; i > -1; i--) {
			dfs(now*10+arr[i]);
		}
	}
}
