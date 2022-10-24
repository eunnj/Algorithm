
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			HashMap<Integer,Integer> map = new HashMap<>();
			
			
			String[] str1 = br.readLine().split(" ");
			for(int i=0;i<N;i++) {
				int num = Integer.parseInt(str1[i]);
				if(map.containsKey(num)) {
					int value = map.get(num);
					map.replace(num, value+1);
				}else {
					map.put(num, 1);
				}
			}

			int M = Integer.parseInt(br.readLine());

			int arr[] = new int[M];
			int answer[] = new int[M];
			
			String[] str2 = br.readLine().split(" ");
			for(int i=0;i<M;i++) {
				arr[i] = Integer.parseInt(str2[i]);
			}
			
			
			StringBuilder sb = new StringBuilder();
		        
			for(int i=0;i<M;i++) {
				if(map.containsKey(arr[i])) {
					 sb.append(map.get(arr[i])).append(" ");
				}else {
					sb.append("0 ");
				}
			}
			
			 System.out.println(sb.toString());
			
		}
}