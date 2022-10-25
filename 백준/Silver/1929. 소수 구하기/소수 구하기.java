import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str[] = br.readLine().split(" ");
			
			int M = Integer.parseInt(str[0]);
			int N = Integer.parseInt(str[1]);
			
			int arr[] = new int[N+1];
			
			arr[0]=1; // 1일때는 소수가 아니므로 다르게 초기화
			arr[1]=1; // 1일때는 소수가 아니므로 다르게 초기화
			
			// 초기화 : 소수일 때 0, 소수가 아니면 1
			for(int i=2;i<=N;i++) {
				arr[i]=0;
			}
			
			for(int i=2;i<=N;i++) {
				if(arr[i]==0 && i>=M) System.out.println(i);
				for(int j=i*2;j<=N;j+=i){
					if(arr[j]!=1) {
						arr[j]=1;
					}else {
						continue;
					}
				}
			}
			
		}
}