class Solution {
    public int pivotIndex(int[] nums) {
        int arr[] = new int[nums.length+1];
        arr[0]=0;
        for(int i=1;i<arr.length;i++)
            arr[i]=nums[i-1];
        
        int right=0;
        for(int n:nums)
            right+=n;
        
        
        int left=0;
        for(int i=1;i<arr.length;i++){
             left+=arr[i-1];
             right-=arr[i];
             if(left==right) return i-1;
        }

        return -1;
    }
}