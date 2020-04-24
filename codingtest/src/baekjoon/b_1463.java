package baekjoon;

import java.util.Scanner;

public class b_1463 {
	public static void main(String args[]) {
		
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		int cnt = 0;
		int min = 100000000; 
		
		while(N==1) {
			
			if(N/3==0) {
				N/=3;
				
			}
			if(N/2==0) {
				N/=2;
				
			}
			if(N>1) {
				N-=1;
				
			}
			cnt++;
			
		}
		
	}
}
