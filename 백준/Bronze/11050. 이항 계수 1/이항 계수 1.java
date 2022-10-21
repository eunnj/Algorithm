
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		int a=1;
		int b=1;
		
		for(int i=K;i>1;i--) {
			b*=i;
		}
		
		while(K>0) {
			a*=N;
			N--;
			K--;
		}

		System.out.print(a/b);
	}
	
}
