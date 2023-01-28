class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                        sum = nums[i]+nums[j]+nums[k];
                        if(isPrime(sum)) answer++;
                }
            }
        }

        return answer;
    }
    
    public boolean isPrime(int num){
        if(num<=2) return true;
        else{
            for(int i=2;i<num;i++){
                if(num%i==0) return false;
            }
        }
        return true;
    }
}