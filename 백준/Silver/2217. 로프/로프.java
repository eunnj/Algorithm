import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int max=arr[N-1];
		for(int i=0;i<N;i++) {
			max=Math.max(max, arr[i]*(N-i));
		}
		
		System.out.print(max);
	}
}
