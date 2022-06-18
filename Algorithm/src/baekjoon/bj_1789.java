package baekjoon;
import java.util.*;
public class bj_1789 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		long S = s.nextLong();
		long sum=0;
		int i =1;
		
		while(true) {
			sum+=i;
			if(sum>S) {
				i--;
				break;
			}
			i++;
			
		}
		System.out.print(i);
	}
}
