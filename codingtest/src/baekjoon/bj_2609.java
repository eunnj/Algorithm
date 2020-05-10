package baekjoon;

import java.util.Scanner;

public class bj_2609 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	
		int a = s.nextInt();
		int b = s.nextInt();
		
		gcd(a,b);
		lcm(a,b);
	}
	
	//최대공약수
	public static void gcd(int num1,int num2) {
		int a = num1; int b= num2;
		while(b!=0) {
			int r = a % b;
			a=b;
			b=r;
		}
		int gcd=a;
		System.out.println(gcd);
	}
	
	//최소공배수
	public static void lcm(int num1,int num2) {
		int gcd;
		int a = num1; int b= num2;
		while(b!=0) {
			int r = a % b;
			a=b;
			b=r;
		}
		gcd=a;
		int lcm = gcd * (num1/gcd) * (num2/gcd);
		System.out.println(lcm);
	}
}
