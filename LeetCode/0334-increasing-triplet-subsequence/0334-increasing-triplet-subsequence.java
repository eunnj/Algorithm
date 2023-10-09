class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean answer = false;
        
        int min = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=min) min=nums[i];
            else if(nums[i]<=middle) middle=nums[i];
            else return true;
        }
        
        return answer;
        
    }
}
