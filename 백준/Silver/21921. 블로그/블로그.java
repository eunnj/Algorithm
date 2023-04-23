import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int X = Integer.parseInt(str[1]);
		
		int [] arr = new int [N];
		String str2[] = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			arr[i] =  Integer.parseInt(str2[i]);
		}
		
		int end = 0;
		int max = 0;
		int sum = 0;
		int cnt = 1;
		
 		for(int i=0;i<N;i++) {
 			 while((end - i < X) && end < N){
                 sum += arr[end];
                 end++;
             }
 			
 			if(max<sum) {
 				max=sum;
 				cnt=1;
 			}else if(max==sum) {
 				cnt++;
 			}
 			
 	        sum -= arr[i];
 		}
		
 		if(max!=0) {
 			 System.out.println(max);
 			 System.out.println(cnt);
 		}else {
 			 System.out.println("SAD");
 		}
 		
 		
	}
}
