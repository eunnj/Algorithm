import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<String> reverse = new ArrayList<>();
        
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                answer+=Integer.toString(i);
                reverse.add(Integer.toString(i));
            }
        }
        
        Collections.sort(reverse, Collections.reverseOrder());
        for(int j=0;j<food[0];j++){
            answer += "0";
        }
        
        for(int j=0;j<reverse.size();j++){
            answer+=reverse.get(j);
        }
        
        System.out.println(answer);
        
        return answer;
    }
}