import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long arr[] = new long[N];
		
		for(int i=0;i<N;i++)
			arr[i]=Long.parseLong(br.readLine());
		
		Arrays.sort(arr);
		
		long answer = 0;
		for(int i=N-1;i>=0;i--) {
			long sum = arr[i]-(long)(N-i-1);
			if(sum>0) answer+=sum;
            else break;
		}
		
		System.out.print(answer);
 	}
}
