class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int len = number.length;
        
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                for(int z=j+1;z<len;z++){
                    int sum=number[i]+number[j]+number[z];
                    if(sum==0) answer++;
                }
            }
        }
        return answer;
    }
}