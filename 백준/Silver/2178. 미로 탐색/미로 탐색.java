import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[][] graph;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);

		graph = new int[N][M];
        visited = new boolean[N][M];
        
  		for(int i=0;i<N;i++) {
  			String move[]=br.readLine().split("");
  			for(int j=0;j<M;j++) {
  				graph[i][j]=Integer.parseInt(move[j]);
  			}
  		}
  	

        visited[0][0] = true; 
        bfs(0, 0);
        
       System.out.print(graph[N-1][M-1]);
    }

    public static void bfs(int x, int y) {
        Queue<Integer> qx= new LinkedList();
		Queue<Integer> qy= new LinkedList();
		
		qx.add(x);
		qy.add(y);
		
        while(!qx.isEmpty()&&!qy.isEmpty()) {
            int nx = qx.poll();
            int ny = qy.poll();

            for(int i=0;i<4;i++) {
                int nextX = nx + dx[i];
                int nextY = ny + dy[i];

                if(nextX>=0 && nextX<N && nextY>=0 && nextY<M) {
                    if(graph[nextX][nextY]==1 && !visited[nextX][nextY]) {
                        qx.add(nextX);
                        qy.add(nextY);
                        visited[nextX][nextY]=true;
                        graph[nextX][nextY] = graph[nx][ny]+1;
                    }
                }
            }
        }
     }
}