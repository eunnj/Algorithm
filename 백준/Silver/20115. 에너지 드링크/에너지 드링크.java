import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		
		long arr[] = new long[N];
		for(int i=0;i<N;i++) {
			arr[i]=Long.parseLong(str[i]);
		}
		
		Arrays.sort(arr);
		
		double max = arr[0]/2.0+arr[N-1];
		for(int i=1;i<N-1;i++) {
			max = Math.max(max/2.0+arr[i], max+arr[i]/2.0);
		}
		
		System.out.print(max);
	}
}
