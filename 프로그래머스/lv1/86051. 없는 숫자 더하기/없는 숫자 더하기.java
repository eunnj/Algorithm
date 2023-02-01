import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int num:numbers){
            arr.add(num);
        }
        
        
        for(int i=0;i<=9;i++){
            if(!arr.contains(i)) answer+=i;
        }
        
        return answer;
    }
}