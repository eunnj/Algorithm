import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int M = Integer.parseInt(br.readLine());
		
		
		int arr[]= new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		
		int l = 0;
		int r = arr[N-1];
		int sum = 0;
		while(l<=r) {
			int mid = (l+r)/2;
			sum=0;
			
			for(int i=0;i<N;i++) {
				if(arr[i]<mid) sum+=arr[i];
				else sum+=mid;
			}
			if(sum>M) {
				r=mid-1;
			} 
			else if(sum<M){
				l=mid+1;
			}
			else { 
				r=mid;
				break;
			}
		}
		
		System.out.print(r);
	}
}
