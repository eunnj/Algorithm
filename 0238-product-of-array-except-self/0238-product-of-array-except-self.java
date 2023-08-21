class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int mul_nozero=1;
        int cnt=0;
        int answer[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            mul*=nums[i];
            if(nums[i]!=0) {
                mul_nozero*=nums[i];
            }else{
                cnt++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                if(cnt==1) answer[i]=mul_nozero;
                else answer[i]=0;
            }
            else answer[i]=mul/nums[i];
        }
        
        return answer;
    }
}