package baekjoon;
import java.util.Scanner;

public class bj_14888 {
	
	public static int MAX = -1000000000; // �ִ� 
	public static int MIN = 1000000000;	// �ּڰ� 
	public static int[] op = new int[4]; // ������ 
	public static int[] arr; // ���� 
						
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 
		int N = s.nextInt();
		arr = new int[N];
 
		// ���� �Է�
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
 
		// ������ �Է�
		for (int i = 0; i < 4; i++) {
			op[i] = s.nextInt();
		}
 
		dfs(arr[0], 1);
 
		System.out.println(MAX);
		System.out.println(MIN);
	}
	
	public static void dfs(int num, int idx) {
		
		// ���̰� T�� ��������
		if (idx == arr.length) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
 
		for (int i = 0; i < 4; i++) {
			// ������ ������ 1�� �̻��� ���
			if (op[i] > 0) {
 
				// �����ڸ� 1 ����
				op[i]--;
 
				switch (i) {
 
				case 0:	dfs(num + arr[idx], idx + 1);	break;
				case 1:	dfs(num - arr[idx], idx + 1);	break;
				case 2:	dfs(num * arr[idx], idx + 1);	break;
				case 3:	dfs(num / arr[idx], idx + 1);	break;
 
				}
				// ���ȣ���� ���� �� �ش� ������ ���� ����
				op[i]++;
			}
		}
	}
}
