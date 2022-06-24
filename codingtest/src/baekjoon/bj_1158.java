package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class bj_1158 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> queue = new LinkedList<Integer>();
		
		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		String ret = "<";
		
		for(int i=1;i<=N;i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				queue.offer(queue.poll());
            }
			if(queue.size()!=1) {
				ret += Integer.toString(queue.poll())+", ";
				
			}
			else {
				ret += Integer.toString(queue.poll());
				
			}
			
		}
		
		bw.write(ret+">");
		
		br.close();
		bw.close();
		
	}
}
