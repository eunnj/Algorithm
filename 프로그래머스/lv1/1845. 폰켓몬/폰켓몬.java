import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> map = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.contains(nums[i])) map.add(nums[i]);
        }
        
        if(map.size()>=nums.length/2){
            answer = nums.length/2;
        }else{
            answer=map.size();
        }
        
        return answer;
    }
  
}