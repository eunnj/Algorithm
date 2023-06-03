import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Integer> hash = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String str[] =br.readLine().split("\\.");
			
			if(hash.containsKey(str[1])) {
				int cnt = hash.get(str[1]);
				hash.put(str[1],cnt+1);
			}else {
				hash.put(str[1],1);
			}
			
		}
	
		Object[] keyset = hash.keySet().toArray();
		Arrays.sort(keyset);
		
		for(int i=0;i<hash.size();i++) {
			System.out.println(keyset[i]+" "+hash.get(keyset[i]));
		}
	}
}
