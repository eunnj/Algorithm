import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
	static Set<String> set;
	static String str[];
	static boolean visit[];
	static int n,k;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		set = new HashSet<>();
		str = new String[n];
		visit = new boolean[n];
		
		for(int i=0;i<n;i++) {
			str[i]=br.readLine();
		}
		
		solve("",0);
		System.out.print(set.size());
	}
	
	public static void solve(String s,int cnt) {
		if(cnt==k) {
			set.add(s);
			return;
		}
		
		 for(int i = 0; i < str.length; i++){
	            if(visit[i]) continue;
	 
	            visit[i] = true;
	            solve(s + str[i], cnt + 1);
	            visit[i] = false;
	        }
	}
}
