import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int N = Integer.parseInt(str);
		
		int start = 1;
		int end = 1;
		int cnt = 0;
		int sum = 1;
		
		while(start <= end){
		    if(sum == N) cnt++;
		    if(sum < N){
		        end++;
		        sum+=end;
		    }else if(sum >= N){
		        sum -= start;
		        start++;
		    };
		}
 		
		System.out.println(cnt);
 		
	}
}
