import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_a=0;
        int max_b=0;
        
        for(int i=0;i<sizes.length;i++){
            int a = sizes[i][0];
            int b = sizes[i][1];
            
            sizes[i][0]= Math.min(a,b);
            sizes[i][1]= Math.max(a,b);
            
            
            if(max_a<sizes[i][0]) max_a=sizes[i][0];
            if(max_b<sizes[i][1]) max_b=sizes[i][1];
        }
        
        answer = max_a*max_b;
        return answer;
    }
}