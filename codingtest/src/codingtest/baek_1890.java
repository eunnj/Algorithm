package codingtest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class baek_1890 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		int dp[][] = new int [N][N];
		boolean graph[][] = new boolean [N][N];
		int cnt =0 ;
		

		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				dp[i][j] = s.nextInt();
			}
		}
	
		for (int i = 0; i < N; i++) {
			 for(int j=0; j<N; j++) {
				 graph[i][j] = false; //false으로 초기화
			 }
		}
		graph[0][0]=true; //시작 노드  초기화
		
		Queue<Integer> x= new LinkedList();
		Queue<Integer> y= new LinkedList();
		Vector<Integer> v = new Vector<Integer>();
		
		//초기 상태
		y.add(0);
		x.add(0);
		
		for(int t=0; t<2;t++) {
			v.add(0);
		}
		
		while(!x.isEmpty()&&!y.isEmpty()) {
			int now_x =x.poll();
			int now_y =y.poll();
			int index=0;
			
			for(int j=0; j<2;j++) {
				
				int n = dp[now_x][now_y];
				int [] moveRow = {n,0};
				int [] moveCol = {0,n};
				
				int next_x = now_x + moveRow[j];
				int next_y = now_y + moveCol[j];
				
				if(next_x < N && next_y < N && //x,y값이 그래프 배열의 크기보다 작고
						   next_y >= 0 && next_x >= 0 && //next_y,next_x값이 0보다 크거나 작고
						  graph[next_y][next_x] == false //그래프 배열에서 초기값이 false
						   ) 
						{
						graph[next_y][next_x] = true; //방문했음을 표시 

						int next = dp[next_y][next_x];
						x.add(next_x);
						y.add(next_y);
						
						cnt = v.elementAt(index);
						cnt++;
						v.set(index,cnt);
						
						index++;
						}

			}
		
		}

		System.out.print(cnt);
	}
}
