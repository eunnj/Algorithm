package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2798 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		String card_str[] = br.readLine().split(" ");
		int card[] = new int[N];
		for(int i=0;i<N;i++) {
			card[i]=Integer.parseInt(card_str[i]);
		}
		
		int first =0;
		int second =0;
		int third =0;
		int result =0;
		int total=0;
		
		for(int i=0;i<N-2;i++) {
			first = card[i];
			if(first > M) {
				continue;
			}
			for(int j=i+1;j<N-1;j++) {
				second=card[j];
				
				if(first+second>M) continue;
				
				for(int z=i+1;z<N-2;z++) {
					third=card[z];
					
					total = first+second+third;
					if(total==M) {
						result = total;
						break;
					}
					
					if(total<M && total>result) {
						result = total;
					}
				}
				
			}
		}
		
		System.out.println(result);

	}
}
