
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();	// 테스트 케이스 
 
		while (T > 0) {
			
			int N = s.nextInt();
			int M = s.nextInt();
			
			LinkedList<int[]> q = new LinkedList<>();
 
			for (int i = 0; i < N; i++) {
				// 큐 초기화 (위치, 우선순위)
				q.offer(new int[] { i, s.nextInt() });
			}
 
			int count = 0;
			
			while (!q.isEmpty()) {	
				
				int[] first = q.poll();	// 첫 번째 원소
				boolean flag = true;	// 우선 순위 판단
				
				
				for(int i = 0; i < q.size(); i++) {
					// 첫 번째 원소보다 큐에 있는 i번째 원소의 중요도가 클 경우
					if(first[1] < q.get(i)[1]) {
						// 첫 번째 원소와 i 전까지 원소를 뒤로 보낸다
						q.offer(first);
						for(int j = 0; j < i; j++) {
							q.offer(q.poll());
						}
						flag = false;
						break;
					}
				}
				
				if(flag == false) {
					continue;
				}
				
				count++;
				if(first[0] == M) {	
					break;
				}
 
			}
 
			System.out.println(count);
			T--;
		}
		
	}
 
}