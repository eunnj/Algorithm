import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
 
		int K = Integer.parseInt(str[0]);
		int N = Integer.parseInt(str[1]);
		
		int num[] = new int[N];
		
		
		long max = 0;
		long min = 0;
		for(int i=0;i<K;i++) {
			num[i]= Integer.parseInt(br.readLine());
			if(max<num[i]) max=num[i];
		}
		
        max++;
		long len = 0;
		long cnt=0;
		
		while(min<max) {
			cnt=0;
			len = (min+max)/2;
			for(int i=0;i<K;i++) {
				cnt+=(num[i]/len);
			}
			
			if(cnt<N) {
				max=len;
			}else{
				min=len+1;
			}
		}
		
		System.out.println(min-1);
	}
 
}