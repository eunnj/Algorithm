
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int [] moveRow = {1,0,-1,0};
	static int [] moveCol = {0,1,0,-1};
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt(); 
		int M = s.nextInt(); 
		
		int graph[][]= new int[N][M];
		boolean visit[][]= new boolean[N][M];		
		
		for(int i=0;i<N;i++) {
			String str = s.next();
			for(int j=0; j<M; j++) {
				graph[i][j] = str.charAt(j)-'0'; //0~9의 아스키코드는 48~
			}
		}
		
		visit[0][0]=true;
		
		Queue<Integer> x= new LinkedList();
		Queue<Integer> y= new LinkedList();
		
		y.add(0);
		x.add(0);
		
		while(!x.isEmpty()&&!y.isEmpty()) { //que에 값이 없을때까지 반복
			int now_x =x.poll();
			int now_y =y.poll();
		
			for(int z=0; z<moveRow.length;z++) {
				int next_x = now_x + moveRow[z];
				int next_y = now_y + moveCol[z];
				
				if (next_x < 0 || next_y < 0 || next_x >= N || next_y >= M) {
                    continue;
                }
				
				if (visit[next_x][next_y]==true || graph[next_x][next_y] == 0) {
                    continue;
                }
				
				graph[next_x][next_y] = graph[now_x][now_y] + 1;
				visit[next_x][next_y] = true;
				
				y.add(next_y);
				x.add(next_x);
				
			}
		}
		
		System.out.println(graph[N-1][M-1]);
    }
	}

	

