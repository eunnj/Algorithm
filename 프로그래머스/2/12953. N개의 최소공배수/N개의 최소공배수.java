class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        answer=solve(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            answer=solve(answer,arr[i]);
        }
        
        return answer;
    }
    
    public static int solve(int a, int b){
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        
        while(min!=0){
            int temp=min;
            min=max%min;
            max=temp;
        }
        
        return a*b/max;
    }
}