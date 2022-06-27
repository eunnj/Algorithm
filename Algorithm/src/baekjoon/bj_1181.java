package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bj_1181 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String arr[]= new String[N];
		for(int i=0;i<N;i++) {
			arr[i]=br.readLine();
			
		}
		Arrays.sort(arr,new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		    	if(s1.length() == s2.length()) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
		    		return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();
				}
		    }
		});
		
		System.out.println(arr[0]);
		for(int i=1;i<N;i++) {
			if (!arr[i].equals(arr[i - 1]))
				System.out.println(arr[i]);
		}
		
	}
}
