
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Queue<Integer> que =new LinkedList<>(); 
			
			String str[] = br.readLine().split(" ");
			
			int N = Integer.parseInt(str[0]);
			int K = Integer.parseInt(str[1]);
			String result = "<";
			
			
			 for(int i=1;i<=N;i++) {
				que.offer(i);
			}
			

		
			while(!que.isEmpty()) {
				
				for(int i=1;i<K;i++) {
					que.offer(que.poll());
					
				}
				if(que.size()!=1)
					result+=  que.poll() +", ";
				else 
					result+=  que.poll() +">";
			}
			
			System.out.print(result);
		}
	}

