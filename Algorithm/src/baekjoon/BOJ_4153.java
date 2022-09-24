package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_4153 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0 0 0")) break;
			else {
				String ss[]=str.split(" ");

				int len[] = new int[3];
				for(int i=0;i<3;i++) {
					len[i]=Integer.parseInt(ss[i]);
				}
				
				Arrays.sort(len);
				
				double a = Math.pow(len[0],2);
				double b = Math.pow(len[1],2);
				double c = Math.pow(len[2],2);
				System.out.println(a+" "+b+" "+c);
				if(a+b==c) System.out.println("right");
				else  System.out.println("wrong");
			}
		}
	}
}
