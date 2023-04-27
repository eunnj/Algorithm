import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1[] = br.readLine().split(" ");
		String str2[] = br.readLine().split(" ");
		
		final int INF = (int)10e6;
		int N = Integer.parseInt(str1[0]);
		int K = Integer.parseInt(str1[1]);
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(str2[i]);
		}
		
		int cnt=0;
		int start=-1, end=-1;
		for(int i=0;i<N;i++) {
			if(arr[i]==1) cnt++;
			
			if(cnt==1&&start==-1) {
				start=i;
			}else if(cnt==K) {
				end=i;
				break;
			}else continue;
		}
		
		int len=0;
		int min=INF;
		
		while(start>=0&&start<N && end<N&&end>=0) {
			len = end++ -start++ +1;
			min=Math.min(min, len);
			
			while(start<N && arr[start]!=1) start++;
			while(end<N && arr[end]!=1) end++;
			
		}
		if(min==INF) System.out.println(-1);
		else System.out.print(min);
	}
}
