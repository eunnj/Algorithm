package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1978 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		String str[] = br.readLine().split(" ");
		int cnt =0;
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(str[i]);
			if(isPrime(arr[i])) cnt++;
		}
		
		System.out.println(cnt);
	}
	
	static boolean isPrime(int x) {
		boolean isprime = true;
		
		if(x==1) isprime=false;
		else if(x==2) isprime=true;
		else {
			for(int i=2;i<x;i++) {
				if((x%i)!=0) continue;
				else {
					isprime=false;
					break;
				}
			}
		}
		
		return isprime;
	}
}
