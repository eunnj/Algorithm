import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        
        int idx = 1;
        while(idx<=elements.length){
             for (int i = 0; i < elements.length; i++) {
                int value = 0;
                for (int j = i; j < i + idx; j++) {
                    value += elements[j % elements.length];
                }
                set.add(value);
            }
            idx++;
        }
        
        answer = set.size();
        return answer;
    }
}