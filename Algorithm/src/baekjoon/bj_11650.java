package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bj_11650 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		int graph[][] = new int[N][2];
		
		for(int i=0;i<N;i++) {
			String str[] = br.readLine().split(" ");
			
			graph[i][0]=Integer.parseInt(str[0]);
			graph[i][1]=Integer.parseInt(str[1]);
			
		}
		
		Arrays.sort(graph,new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		    	if(o1[0] == o2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
					return o1[1] - o2[1];
				}
				else {
					return o1[0] - o2[0];
				}
		    }
		});
		
		for(int i=0;i<N;i++) {
			
			System.out.println(graph[i][0]+" "+graph[i][1]);
			
		}
	}
}
