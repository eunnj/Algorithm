package Level2;
import java.util.*;

public class Hindex {
	class Solution {
	    public int solution(int[] citations) {
	        int answer = 0;
	        Arrays.sort(citations);
	        
	        for(int i=0;i<citations.length;i++){
	            int h = citations[i];
	            int k = citations.length-i;
	            
	            if(h>=k){
	                answer = k;
	                break;
	            }
	            
	        }
	        return answer;
	    }
	}
}
