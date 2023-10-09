class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        
        while(r<nums.length){
            while (r < nums.length-1 && nums[r] == 0)  r++;
            
            if(nums[l]==0 && nums[r]!=0){
                    int temp = nums[l];
                    nums[l]=nums[r];
                    nums[r]=temp;
             }
                l++;
                r++;
        }
    
        
    }
}

