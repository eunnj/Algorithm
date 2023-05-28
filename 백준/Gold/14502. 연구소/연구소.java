
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static int N;
	public static int M;
	public static int map[][];
	public static int virusmap[][];
	public static int dx[] = {1,-1,0,0};
	public static int dy[] = {0,0,1,-1};
	public static int max = Integer.MIN_VALUE;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		map = new int[N][M];
		
		for(int i=0;i<N;i++) {
			String str2[] = br.readLine().split(" ");
			for(int j=0;j<M;j++) {
				map[i][j]=Integer.parseInt(str2[j]);
			}
		}
		
		dfs(0);
		
		System.out.println(max);
	}
	
	public static void dfs(int wall) {
		if(wall==3) {
			bfs();
			return;
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==0) {
					map[i][j]=1;
					dfs(wall+1);
					map[i][j]=0;
				}
			}
		}
	
		
	}

	public static void bfs() {		
		Queue<Integer> qx= new LinkedList();
		Queue<Integer> qy= new LinkedList();
		virusmap=new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				 virusmap[i][j] = map[i][j];
	             if (virusmap[i][j] == 2) {
	            	 qx.add(i);
	            	 qy.add(j);
	               }
			}
		}
		
	    while (!qx.isEmpty()&&!qy.isEmpty()) {
            int nx = qx.poll();
            int ny = qy.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = nx + dx[i];
                int nextY = ny + dy[i];

                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && virusmap[nextX][nextY] == 0) {
                    virusmap[nextX][nextY] = 2;
                    qx.add(nextX);
                    qy.add(nextY);
                }
            }
        }
	    
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (virusmap[i][j] == 0) {
                    count++;
                }
            }
        }
        max = Math.max(max, count);
		
	}
}
