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
				 graph[i][j] = false; //false���� �ʱ�ȭ
			 }
		}
		graph[0][0]=true; //���� ���  �ʱ�ȭ
		
		Queue<Integer> x= new LinkedList();
		Queue<Integer> y= new LinkedList();
		Vector<Integer> v = new Vector<Integer>();
		
		//�ʱ� ����
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
				
				if(next_x < N && next_y < N && //x,y���� �׷��� �迭�� ũ�⺸�� �۰�
						   next_y >= 0 && next_x >= 0 && //next_y,next_x���� 0���� ũ�ų� �۰�
						  graph[next_y][next_x] == false //�׷��� �迭���� �ʱⰪ�� false
						   ) 
						{
						graph[next_y][next_x] = true; //�湮������ ǥ�� 

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
