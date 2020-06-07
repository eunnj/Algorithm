package baekjoon;

import java.util.Scanner;

public class baek_11053 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int arr[] = new int[N];
		int dp[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			dp[i]=1;
		}
		
		int max = 0;
		
		for(int i=1;i<N;i++) { //초기값은 arr[0]이기 때문에 생략
			for(int j=0;j<i;j++) {
				if(j==0) {
					if(arr[i]>arr[j]) dp[i]+=1;
				}
				else if(j!=0 && arr[i]>arr[j] && arr[j]>arr[0] && arr[j]>arr[j-1]) dp[i]+=1;
			
			 max = Math.max(max, dp[i]);
		}
	}
		System.out.println(max);
		
		/*for(int i=0; i<N; i++) {
			System.out.println(dp[i]);

		}*/
		
	}
}
