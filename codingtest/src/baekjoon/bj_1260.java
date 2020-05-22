package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bj_1260 {
	static boolean[] check;
	static ArrayList<Integer> nodes[];
	static int N;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	
		int N = s.nextInt(); //정점의 개수
		int M = s.nextInt(); //간선의 개수
		int V = s.nextInt(); //정점의 번호
		
		check =new boolean[N+1];
		nodes = new ArrayList[N+1];
		
		for(int i=1; i<=N; i++) {
			nodes[i] = new ArrayList();
			check[i]=false;
		}
		
		for (int i = 0; i < M; i++) {
			int n1 = s.nextInt();
			int n2 = s.nextInt();	
			nodes[n1].add(n2); 
			nodes[n2].add(n1);
			Collections.sort(nodes[n1]);
			Collections.sort(nodes[n2]);
			
	}
		

		dfs(V);
		System.out.println();
		
		//방문 체크 베열 초기화
		for(int i=1; i<=N; i++) {
			check[i]=false;
		}
		
		bfs(V);

	}
	
	//깊이 우선
	public static void dfs(int v) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(v);
		
		while(!stack.isEmpty()) {
			int current = stack.pop();
			
			if(check[current]==false) {
				check[current]=true;
				System.out.print(current+" ");
				
				
				for(int i:nodes[current]) {
					if (check[i]==false)
						dfs(i);
				}
			}
			
		}
		
	}
	
	//너비 우선
	public static void bfs(int v) {
		Queue<Integer> que = new LinkedList();
		que.add(v); //시작점
		check[v] = true;
		
		while(!que.isEmpty()) {
			int current = que.poll();
			
			System.out.print(current+" ");
		
			  for(int i : nodes[current]){
	                if(check[i]==false){
	                    que.add(i);
	                    check[i] = true;
	                }
	                
	            }
			

		      
		}
		
	}
}
