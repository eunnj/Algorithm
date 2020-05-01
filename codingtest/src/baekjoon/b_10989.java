package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class b_10989 {
	public static void main(String[] args) throws Exception  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 
		int arr[]=new int[10001];
		
		for(int i=0;i<N;i++) {
			arr[Integer.parseInt(br.readLine())]++; //숫자 개수 count
		}
		
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        for(int i=0; i < arr.length; i++) {
	            if(arr[i] > 0) { //숫자 개수가 있을 때
	                for(int j = 0; j < arr[i]; j++) {
	                    bw.write(Integer.toString(i) + "\n");
	                }
	            }
	        }
	        
	        br.close();
	        bw.close();


		
		}
	}

