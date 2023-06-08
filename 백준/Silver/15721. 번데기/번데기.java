import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int bcnt=0;
	public static int dcnt=0;
	public static int arr[] = {0,1,0,1};
	public static int ret = 0;
	public static int A,T,ans;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		A = Integer.parseInt(br.readLine());
		T = Integer.parseInt(br.readLine());
		ans = Integer.parseInt(br.readLine());
		
		System.out.print(play());
		
	}
	
	public static int play() {

		int gamecnt = 2;
		while(true) {
			
			for(int i=0;i<4;i++) {
				if(arr[i]==0) bcnt++;
				else dcnt++;
				
				if(ans==0 && bcnt==T) {
					ret = (bcnt+dcnt-1)%A;
					return ret;
				}
				if(ans==1 && dcnt==T) {
					ret = (bcnt+dcnt-1)%A;
					return ret;
				}
			}
			
			for(int i=0;i<gamecnt;i++) {
				bcnt++;
				if(ans==0 && bcnt==T) {
					ret = (bcnt+dcnt-1)%A;
					return ret;
				}
			}
			

			for(int i=0;i<gamecnt;i++) {
				dcnt++;
				if(ans==1 && dcnt==T) {
					ret = (bcnt+dcnt-1)%A;
					return ret;
				}
			}
			
			gamecnt++;
		}
		
	}
}
