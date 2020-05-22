package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class bj_11724 {
	static boolean check[];
	static ArrayList<Integer> nodes[];
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt(); //정점의 개수
		int M = s.nextInt(); //간선의 개수
		int cnt=0; //연결 요소 수
		
		
		check =new boolean[N+1];
		nodes = new ArrayList[N+1];
		
		for(int i=1; i<=N; i++) {
			nodes[i] = new ArrayList<Integer>();
			check[i]=false;
		}
		
		for (int i = 0; i < M; i++) {
			int n1 = s.nextInt();
			int n2 = s.nextInt();	
			nodes[n1].add(n2); 
			nodes[n2].add(n1);
	}
		
		for(int i = 1; i < N+1; i++) {
			if(!check[i]) {
				dfs(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
		
	}
	
	public static void dfs(int v) {
		 if(check[v]) {
	            return;
	        }
		 check[v]=true;
	        for(int i : nodes[v]){
	            if(!check[i]) {
	                dfs(i);
	            }
	        }
		
	
	}
}
