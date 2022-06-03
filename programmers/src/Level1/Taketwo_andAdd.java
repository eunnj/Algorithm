package Level1;
import java.util.*;

public class Taketwo_andAdd {
	class Solution {
	    public int[] solution(int[] numbers) {
	        int[] answer = {};
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        for(int i=0;i<numbers.length;i++){
	            for(int j=i+1;j<numbers.length;j++){
	                int num=numbers[i]+numbers[j];
	                if(!list.contains(num)) {
	                    list.add(num);}
	            }
	        }
	        
	        answer = new int[list.size()];
	        
	        for(int i=0;i<answer.length; i++){
	            answer[i] = list.get(i);
	        }
	        
	        Arrays.sort(answer);
	        
	        return answer;
	    }
	}
}
