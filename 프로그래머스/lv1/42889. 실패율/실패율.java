import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer,Double> map = new HashMap<>();
        
        int cnt=0;
        int total = stages.length;
        
        for(int i=1;i<=answer.length;i++){
            cnt=0;
            for(int j=0;j<stages.length;j++){
                if(stages[j]==i) cnt++;
            }
            if(total==0) map.put(i,0.0);
            else{
                map.put(i,(double)cnt/total);
                total-=cnt;
            }
        }
       
        
        for(int key : map.keySet()){
           System.out.println(map.get(key));
        }
        
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
		Collections.sort(keySet, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		
        for(int i=0;i<answer.length;i++){
            answer[i]=keySet.get(i);
        }
        
        return answer;
    }
}