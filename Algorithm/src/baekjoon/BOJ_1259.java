package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new  InputStreamReader(System.in));
		
		
		while(true) {
			String str = br.readLine();
			if (str.equals("0")) break;
			boolean answer = true;
			int len = str.length();
			
			
			for(int i=0;i<len/2;i++) {
				if(str.charAt(i)!=str.charAt(len-(i+1))) {
					answer=false;
					break;
				}
			}
				
			System.out.println(answer?"yes":"no");
		}
	}
}
