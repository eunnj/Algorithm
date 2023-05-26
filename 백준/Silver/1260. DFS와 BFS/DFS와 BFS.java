import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static String str = "";
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    String str_arr[] = br.readLine().split(" ");
		
		int N = Integer.parseInt(str_arr[0]);
		int M = Integer.parseInt(str_arr[1]);
		int V = Integer.parseInt(str_arr[2]);
		LinkedList<Integer> list[] = new LinkedList[N+1];
		boolean visited[] = new boolean[N+1]; // 방문 여부 
		
		for (int i = 0; i <= N; i++) {
			list[i] = new LinkedList<Integer>();
		}

		
		for(int i=0;i<M;i++) {
			String str[] = br.readLine().split(" ");
			int v1 =  Integer.parseInt(str[0]);
			int v2 =  Integer.parseInt(str[1]);
			
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		// 방문 순서 정렬 
		for(int i=0;i<=N;i++) {
			Collections.sort(list[i]);
		}
		
		dfs(V,list,visited);
		
		System.out.println(str);
		
		// 방문 초기화 
		for (int i = 0; i <= N; i++) {
			visited[i] = false;
		}
		
		str=V+ " ";
		
		bfs(V,list,visited);
		System.out.println(str);
	}
	
	
	
	public static void dfs(int v,LinkedList<Integer> list[], boolean visited[]) {
		str += v +" ";
		visited[v]=true; // 방문 
		Iterator<Integer> iter = list[v].listIterator();
		
		while(iter.hasNext()) {
			int x = iter.next();
			if(!visited[x]) { // 방문하지 않았을 때 
				dfs(x,list,visited);
			}
		}
	}
	
	public static void bfs(int v,LinkedList<Integer> list[], boolean visited[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(v);
		visited[v]=true; 
		

        while(!queue.isEmpty()){ 
            int cur = queue.poll(); 
            for(int next : list[cur]) {
                if(!visited[next]) { 
                    visited[next] = true; 
                    queue.add(next);
                    str+=next+ " ";
                }
            }
        }
	}
}
