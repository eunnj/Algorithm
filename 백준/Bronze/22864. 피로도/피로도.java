import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		int M = Integer.parseInt(str[3]);
		
		int time = 0 ;
		int piro = 0;
		int works = 0;
		
		while(time<24) {
			
			// 피로 증가 
			if(piro+A<=M) {
				time++; // 한 시간 일하기 
				piro+=A;
				works+=B;
			}else {
				time++; // 한 시간 휴식 
				piro-=C;
				if(piro<0) piro=0;
			}
			
			
		}
		
		System.out.print(works);
	}
}
