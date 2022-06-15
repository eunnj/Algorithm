package baekjoon;
import java.util.Scanner;

public class bj_14888 {
	
	public static int MAX = -1000000000; // 최댓값 
	public static int MIN = 1000000000;	// 최솟값 
	public static int[] op = new int[4]; // 연산자 
	public static int[] arr; // 숫자 
						
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 
		int N = s.nextInt();
		arr = new int[N];
 
		// 숫자 입력
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
 
		// 연산자 입력
		for (int i = 0; i < 4; i++) {
			op[i] = s.nextInt();
		}
 
		dfs(arr[0], 1);
 
		System.out.println(MAX);
		System.out.println(MIN);
	}
	
	public static void dfs(int num, int idx) {
		
		// 깊이가 T와 같아지면
		if (idx == arr.length) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
 
		for (int i = 0; i < 4; i++) {
			// 연산자 개수가 1개 이상인 경우
			if (op[i] > 0) {
 
				// 연산자를 1 감소
				op[i]--;
 
				switch (i) {
 
				case 0:	dfs(num + arr[idx], idx + 1);	break;
				case 1:	dfs(num - arr[idx], idx + 1);	break;
				case 2:	dfs(num * arr[idx], idx + 1);	break;
				case 3:	dfs(num / arr[idx], idx + 1);	break;
 
				}
				// 재귀호출이 종료 시 해당 연산자 개수 복구
				op[i]++;
			}
		}
	}
}
