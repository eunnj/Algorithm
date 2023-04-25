import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1[] = br.readLine().split(" ");
		String str2[] = br.readLine().split(" ");
		
		int N = Integer.parseInt(str1[0]);
		int K = Integer.parseInt(str1[1]);
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(str2[i]);
		}
		
		int sum=0, max=0;
		int start=0, end=K;
		
		for(int i=0;i<K;i++) {
			sum+=arr[i];
		}
		
		max = sum;
		while(end<N) {
			sum+=arr[end]-arr[start];
			
			if(sum>max) max=sum;
			start++;
			end++;
		}
		
		System.out.print(max);
	}
}
