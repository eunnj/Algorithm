
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ret=0;
		int answer=0;

		
		if(N<=10) answer=N/2;
		else {
			for(int i=10;i<=N;i++) {
			ret = calc(i);
			if(ret==N) {
				answer = i;
				break;
			}
			}
		}
		
		System.out.println(answer);
	}
	
	static int calc(int n) {
		int result=n;
		while(true) {
			
			if(n<100) {
				result += n/10 + n%10;
				break;
			}
			result += n%10;
			n/=10;
		}
		return result;
	}
	
}
