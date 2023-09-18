class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes = 0;
        int left = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) zeroes++;
            if(zeroes > k){
                while(nums[left] != 0){
                    left++;
                }
                zeroes--;
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}