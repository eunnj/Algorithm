import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static int parentNode[];
public static void main(String[] args) throws IOException{	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int N = Integer.parseInt(br.readLine());
	LinkedList<Integer>  list[] = new LinkedList[N+1];
	boolean visited[] = new boolean[N+1];  
	parentNode=new int[N+1];
	
	for (int i = 0; i <= N; i++) {
		list[i] = new LinkedList<Integer>();
	}
	
	for(int i=0;i<N-1;i++) {
		String str[] = br.readLine().split(" ");
		int v1 =  Integer.parseInt(str[0]);
		int v2 =  Integer.parseInt(str[1]);
		
		list[v1].add(v2);
		list[v2].add(v1);
	}
	
	bfs(1,list,visited);
	
	for(int i=2;i<=N;i++)
		System.out.println(parentNode[i]);
	}

	public static void bfs(int v,LinkedList<Integer>[] list,boolean[] visited) {
		Queue<Integer> que = new LinkedList<>();
		visited[v] = true;
		que.add(v);
		
		while(!que.isEmpty()) {
			int cur = que.poll(); 
            for(int next : list[cur]) {
                if(!visited[next]) { 
                    visited[next] = true; 
                    que.add(next);
                    parentNode[next]=cur;
                }
            }
		}
	}
}
