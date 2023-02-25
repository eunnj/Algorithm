import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>(0);
        
        for(int i=0;i<tangerine.length;i++){
            map.put(tangerine[i],map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        ArrayList<Integer> keyset = new ArrayList<>(map.keySet());
        Collections.sort(keyset,(value1, value2) -> 
                         (map.get(value2).compareTo(map.get(value1)))
                        );
      
        int cnt = 0;
        for(int key:keyset){
            if(cnt>=k) break;
            else{
                cnt+=map.get(key);
                answer++;
            }
        }
        return answer;
    }
}