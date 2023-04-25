import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
	    int arr[] = new int[N];
		
	    String str[] = br.readLine().split(" ");
	    
		for(int i=0;i<N;i++) {
			arr[i]= Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		
		int cnt = 0;
		int start=0, end=N-1;
		int sum = 0;
		
		while(start<end) {
			sum=arr[start]+arr[end];
			if(sum==M) {
				cnt++;
				start++;
				end--;
			}else if(sum>M) {
				end--;
			}else {
				start++;
			}
		}
		
		System.out.print(cnt);
	}
}
