
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int min = 64;
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str[] = br.readLine().split(" ");
			
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			boolean map[][]= new boolean[N][M];
			int answer = 0;
			
			
			 for(int i=0;i<N;i++) {
				 String input = br.readLine();
				 for(int j=0;j<M;j++) {
						if (input.charAt(j) == 'W') {
							map[i][j] = true;		// W일 때 true 
						} else {
							map[i][j] = false;		// B일 때 false
						}
				 }	
			}
			
			 
			// 8 * 8  크기까지
			for (int i = 0; i < N-7; i++) {
				for (int j = 0; j < M-7; j++) {
					search(map, i, j);
				}
			}
			
			
			System.out.println(min);
		
		}
		public static void search(boolean[] map[],int x,int y) {
			int cnt = 0;
			boolean color = map[x][y];
			
			for(int i=x; i<x+8; i++) {
				for (int j=y; j<y+8; j++) {
					// 색이 다를 경우
					if (map[i][j] != color) {	
						cnt++;
					}

					// 색 변경
					color = (!color);
			}
				// 색 변경
				color = (!color);
		}
			cnt = Math.min(cnt, 64 - cnt);
			
			min = Math.min(min, cnt);
	}

}