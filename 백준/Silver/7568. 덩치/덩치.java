
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int weight[][] = new int[N][2];
		int answer[] = new int[N];
		
		// 초기화
		for(int i =0 ;i<N;i++) {
			String str[] = br.readLine().split(" ");
			weight[i][0]=Integer.parseInt(str[0]);
			weight[i][1]=Integer.parseInt(str[1]);
			answer[i]=1;
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0 ;j<N;j++) {
				if(weight[i][0]<weight[j][0] && weight[i][1]<weight[j][1]) {
					answer[i]++;
					}
				}
		}
		
		
		
		for(int i=0 ;i<N;i++) {
			System.out.print(answer[i]+" ");
		}
		
	}		
}
