import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] bingo;
	static boolean[][] checked;
	static int cnt=0;
	static int answer=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		bingo = new int[5][5];
		checked = new boolean[5][5];
		
		// 빙고판 초기화 
		for(int i=0;i<5;i++) {
				String str[] = br.readLine().split(" ");
			for(int j=0;j<5;j++) {
				bingo[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		
		int flag = 0;
		// 사회자 수 부르기
		for(int i=0;i<5;i++) {
			String str[] = br.readLine().split(" ");
		for(int j=0;j<5;j++) {
			int num = Integer.parseInt(str[j]);
			if(find(num)==true) {
				System.out.print(i*5+j+1);
				return;
			}
			if(flag==1) break;
		}
	}

}
	
	public static boolean find(int n) {
		cnt = 0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(bingo[i][j]==n) {
					checked[i][j]=true;
					break;
				}
			}	
		}
		
		
		// 가로
		for(int i=0;i<5;i++) {
			int rcnt=0;
			for(int j=0;j<5;j++) {
				if(checked[i][j]) rcnt++;
			}
			if(rcnt==5) cnt++;
		}
		
		
		// 세로
		for(int i=0;i<5;i++) {
			int ccnt=0;
			for(int j=0;j<5;j++) {
				if(checked[j][i]) ccnt++;
			}
			if(ccnt==5) cnt++;
		}
		
		// 대각
		int crxcnt1=0;
		for(int i=0;i<5;i++) {
			if(checked[i][i]) crxcnt1++;
		}
		if(crxcnt1==5) cnt++;
		
		int crxcnt2=0;
		for(int i=0;i<5;i++) {
			if(checked[i][4-i]) crxcnt2++;
		}
		if(crxcnt2==5) cnt++;
		
		if(cnt>=3) return true;
		else return false;
	}
}
