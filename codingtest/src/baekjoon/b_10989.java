package baekjoon;

import java.util.Scanner;

public class b_10989 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int N = s.nextInt();
		int arr[]=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		
		
		/*버블정렬*/
		/*	
	 	for(int i=0;i<N;i++) {
			for(int j=1;j<N;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	 	*/
		
		
		
		quicksort(arr,0,N-1);

			
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}	
	}
	
	/*퀵 정렬*/
	public static void quicksort(int[] arr,int left,int right) {
		int l=left;
		int r= right; 
		int pivot = (l+right)/2;
		
		while(l<r) {
			while(arr[pivot]>arr[l]) l++;
			while(arr[pivot]<arr[r]) r--;
			
			if(l<=r) {
				int temp=arr[r];
				arr[r]=arr[l];
				arr[l]=temp;
				l++;
				r--;
			}
		}
		
		if(left<r) quicksort(arr,left,r);
		if(l<right) quicksort(arr,l,right);

	}
}
