
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		int answer = factorial(N)/(factorial(N-K)*factorial(K));

		System.out.print(answer);
	}
	
	public static int factorial(int n) {
		if(n<=1) return 1;
		else return n*factorial(n-1);
	}
	
}
