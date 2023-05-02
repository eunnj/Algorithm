import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		String str_arr[] = br.readLine().split(" ");
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(str_arr[i]);
		}
		
		Arrays.sort(arr);
		long l=0;
		long r=arr[N-1];
		long sum=0;
		long mid = (l+r)/2;
		while(l<=r) {
			mid = (l+r)/2;
			sum=0;
			for(int i=0;i<N;i++) {
				if(arr[i]>=mid) sum+=arr[i]-mid;
			}
			
			if(sum>M) l=mid+1;
			else if(sum<M) r=mid-1;
			else {
				r=mid;
				break;
				}
		}
		
		System.out.println(r);
	}
}
