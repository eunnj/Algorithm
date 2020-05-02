package baekjoon;

import java.util.Scanner;

public class b_2156 {
public static void main(String args[]) {
		
		Scanner s= new Scanner(System.in);
		
		int N = s.nextInt();
		
		int dp[] = new int[N+1]; // ���� ���� ���� �� �ִ� ������ ��
		int arr[] = new int[N+1]; //�������� ��
		
		for(int i=1;i<=N;i++) {
			 arr[i] = s.nextInt();
		}
		
		
		dp[0]=0;
		dp[1] = arr[1];
		
		if(N>1) dp[2] = arr[1] + arr[2];

		for(int i=3 ;i<=N;i++) {
			dp[i] = Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]); //������ i���� ������ ���
			dp[i] = Math.max(dp[i-1], dp[i]); //�����ָ� �� �� ���� �ȸԾ��� ���, ������ �� �����ָ� ������ �ʾ��� ���
			
		}
		
		System.out.println(dp[N]);
	}
}
