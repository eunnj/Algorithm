package baekjoon;

import java.util.Scanner;

public class bj_3036 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int N =s.nextInt(); //���� ����
		int first = s.nextInt(); //ù ��° ��
		for(int i=0;i<N-1;i++) {
			int rad = s.nextInt();
			int gcd = gcd(first,rad);
			System.out.println(first/gcd+"/"+rad/gcd);
		}
		
		
	}
	public static int gcd(int a, int b){
		while(b!=0){
			int r = a%b;
			a= b;
			b= r;
		}
		return a;
	}
}
