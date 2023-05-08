import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(N%5==0) cnt+=N/5;
		else {
			while(N>0) {
				N-=2;
				cnt++;
				if(N%5==0) break;
			}
			
			if(N%5==0) cnt+=N/5;
			else cnt=-1;
		}
		
		System.out.print(cnt);
	}
}
