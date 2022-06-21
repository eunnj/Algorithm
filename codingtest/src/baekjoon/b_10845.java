package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b_10845 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList();
		
		int N = Integer.parseInt(br.readLine());
		int back = 0;
		
		for(int i=0;i<N;i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
			case "push":
				back=Integer.parseInt(str[1]);
				queue.add(back);
				break;
			case "pop":
				if(queue.isEmpty()) System.out.println("-1");
				else System.out.println(queue.poll());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if(queue.isEmpty()) System.out.println("1");
				else System.out.println("0");
				break;
			case "front":
				if(queue.isEmpty()) System.out.println("-1");
				else System.out.println(queue.peek());
				break;
			case "back":
				if(queue.isEmpty()) System.out.println("-1");
				else System.out.println(back);
				break;
			}
		}
	}
}
