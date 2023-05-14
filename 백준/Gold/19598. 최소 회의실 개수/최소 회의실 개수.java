import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<int[]> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		String str[] = new String[2];
		for(int i=0;i<N;i++) {
			str=br.readLine().split(" ");
			int start = Integer.parseInt(str[0]);
			int end = Integer.parseInt(str[1]);
			
			list.add(new int[]{start,end});
		}
		
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(
				new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return Integer.compare(o1, o2);
					}
				});
		
		int cnt=1;
		pq.offer(list.get(0)[1]);
		
		for(int i=1;i<N;i++) {
			while(!pq.isEmpty()&&pq.peek()<=list.get(i)[0]) {
				pq.poll();
			}
			pq.offer(list.get(i)[1]);
			cnt=Math.max(cnt, pq.size());
		}
		
		System.out.print(cnt);
		
	}
}
