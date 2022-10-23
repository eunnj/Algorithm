
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];
		
		for(int i=0;i<N;i++) {
			String str[] = br.readLine().split(" ");
			arr[i][0] = str[0];
			arr[i][1] = str[1];
		}
		
		Arrays.sort(arr, (o1, o2) -> {
		    return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]); 
		});

		for(int i=0;i<N;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}		
}
