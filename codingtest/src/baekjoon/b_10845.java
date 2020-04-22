package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b_10845 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int back=0;
		Queue<Integer> que = new LinkedList<Integer>();
		
		int N= s.nextInt();
		
		for(int i=0;i<N;i++) {
			String order=s.next();
			
			switch(order) {
			case "push":
				int x = s.nextInt();
				back=x;
				que.add(x);
				break;
			case "pop":
				if(que.isEmpty()) System.out.println(-1);
				else System.out.println(que.poll());	
				break;
			case "size":
				 System.out.println(que.size());
				break;
			case "empty":
				if(que.isEmpty()) System.out.println(1);
				else  System.out.println(0);
				break;
			case "front":
				if(que.isEmpty()) System.out.println(-1);
				else System.out.println(que.peek()); //맨 앞 값 확인
				break;
			case "back":
				if(que.isEmpty()) System.out.println(-1);
				else  System.out.println(back);
				break;
			}
		}
	}
}
