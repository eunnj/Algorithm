package baekjoon;
import java.util.*;
public class bj_3085 {
	 public static char[][] map;
	 public static int N;
	 public static int max = 0;
	    
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		N = s.nextInt();
		map =new char[N][N];
		
		for(int i=0;i<N;i++) {
			String str = s.next();
			for(int j=0;j<N;j++) {
				map[i][j]=str.charAt(j);
			}
		}
		
		int cnt =1;
		
		// 행
		for(int i=0;i<N;i++) { 
			for(int j=0;j<N-1;j++) {
				char ch = map[i][j];
				map[i][j]=map[i][j+1];
				map[i][j+1]=ch;
				
				search();
				
				// 원상복구
				ch = map[i][j];
				map[i][j] = map[i][j+1];
				map[i][j+1] = ch;
                
			}
		}
		
		// 열
		for(int i=0;i<N-1;i++) { 
			for(int j=0;j<N;j++) {
				char ch = map[i][j];
				map[i][j]=map[i+1][j];
				map[i+1][j]=ch;
				
				max = Math.max(search(), max);
				
				// 원상복구
				ch = map[i][j];
				map[i][j]=map[i+1][j];
				map[i+1][j]=ch;
                
			}
		}
		
		  System.out.println(max);
	}
	
	 private static int search() {
	        // 가로
	        for(int i = 0; i < N; i++) {
	            int cnt = 1;
	            for(int j = 0; j < N-1; j++) {
	                if(map[i][j] == map[i][j+1]) {
	                    cnt++;
	                } else {
	                    cnt = 1;
	                }
	                max = Math.max(max, cnt);
	            }
	        }

	        // 세로
	        for(int i = 0; i < N; i++) {
	            int cnt = 1;
	            for(int j = 0; j < N-1; j++) {
	                if(map[j][i] == map[j+1][i]) {
	                    cnt++;
	                } else {
	                    cnt = 1;
	                }
	                max = Math.max(max, cnt);
	            }
	        }

	        return max;
	    }

}
