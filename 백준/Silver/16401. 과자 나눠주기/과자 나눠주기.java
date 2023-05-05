import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int M = Integer.parseInt(str[0]);
		int N = Integer.parseInt(str[1]);
		
		String arr_str[] = br.readLine().split(" ");
		int arr[]= new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(arr_str[i]);
		}
		
		Arrays.sort(arr);
		
		int min=1;
		int max=arr[N-1];
		int mid=(min+max)/2;
		int cnt=0;
		
		while(min<=max) {
			cnt=0;
			mid=(min+max)/2;
			if(mid==0) {
				max=0;
				break;
			}
			for(int i=0;i<N;i++) {
				cnt+=arr[i]/mid;
			}
			
			if(cnt<M) max=mid-1;
			else min=mid+1;
		}
		
		System.out.print(max);
	}
}
