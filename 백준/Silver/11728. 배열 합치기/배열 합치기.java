import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str[] = br.readLine().split(" ");
		int N =  Integer.parseInt(str[0]);
		int	M =  Integer.parseInt(str[1]);
		
		int arr1[] = new int[N];
		int arr2[] = new int[M];
		int answer[] = new int[N+M];
		
		String[] strNum1 = br.readLine().split(" ");
		String[] strNum2 = br.readLine().split(" ");
		
		int idx=0;
		for(int i=0;i<strNum1.length;i++) {
			answer[idx] = Integer.parseInt(strNum1[i]);
			idx++;
		}
		
		for(int i=0;i<strNum2.length;i++) {
			answer[idx] = Integer.parseInt(strNum2[i]);
			idx++;
		}
		
		Arrays.sort(answer);
		
		for(int x : answer) {
			 bw.write(String.valueOf(x) + " ");
		}
		 bw.flush();
	     bw.close();
	}
}
