import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		BigInteger n = new BigInteger(str[0]);
		BigInteger m = new BigInteger(str[1]);
		
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
	}
}
