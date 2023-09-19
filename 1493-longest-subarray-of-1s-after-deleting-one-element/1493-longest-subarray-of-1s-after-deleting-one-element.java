class Solution {
    public int longestSubarray(int[] nums) {
        
        int l=0;
        int zero=0;
        int cnt=0;
        int max=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
                if(zero>1){
                    cnt=i-l-1;
                    zero--;
                }
                l=i;  
            }else{
                cnt++;
            }
            max=Math.max(max,cnt);
        }
        
        if(max==nums.length) return max-1;
        else return max;
    }
}