import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int sum = 0;
        int i=0;
        for(int j=people.length-1;j>=i;j--){
            sum=people[i]+people[j];
            if(sum>limit){
                answer++;
            }else{
                answer++;
                i++;
            }
        }
        
        return answer;
    }
}