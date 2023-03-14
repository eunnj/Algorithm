import java.util.*;

public class Main {
	static int n;
	
	static int dpl[],dpr[], result[],arr[];
	
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		dpl = new int[n+1];
        dpr = new int[n+1];
		arr = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			arr[i] = sc.nextInt();
		}
	
		dpl[1] =1; // 왼쪽부터 시작하는 LIS
		dpr[n] = 1; // 오른쪽부터 시작하는 LIS
        
        for(int i=2;i<=n;i++) { // 왼쪽에서 시작하는 LIS
			dpl[i] =1;
			for(int j=1;j<i;j++) {
				if(arr[i]>arr[j]) {
					dpl[i] = Math.max(dpl[i], dpl[j]+1);
				}
			}
		}
        
		for(int i=n-1;i>0;i--) { // 오른쪽에서 시작하는 LIS
			dpr[i] =1;
			for(int j=n;j>i;j--) {
				if(arr[i]>arr[j]) {
					dpr[i] = Math.max(dpr[i], dpr[j]+1);
				}
			}
		}
		
		
		int ret[]=new int[n+1];
		for(int i=1;i<=n;i++) { // 두 배열의 값들을 더해준다.
			ret[i] = dpr[i] + dpl[i];
			
		}
		
        int max=0;
		for(int i=1;i<=n;i++) {
			if(ret[i] > max) {
				max =ret[i] ;
			}
		}
		
		System.out.println(max-1); // 최댓값을 찾아 -1
		
			
			
		
	}
	
}