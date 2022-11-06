import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int L = Integer.parseInt(br.readLine());
		String M = br.readLine();
		
		long answer=0;
        long pow = 1;
		for(int i=0;i<L;i++) {
			long num = M.charAt(i)-96;
			answer += num *pow;
            pow = (pow * 31) % 1234567891;
            
		}
		System.out.print(answer% 1234567891);
	}		
}
