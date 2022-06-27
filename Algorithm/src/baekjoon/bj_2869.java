package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2869 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str[] = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int V = Integer.parseInt(str[2]);
		
	
		int day = (V - B) / (A - B);
		 
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if( (V - B) % (A - B) != 0 ) {
			day++;
		}
		
		System.out.print(day);
		
	}
}
