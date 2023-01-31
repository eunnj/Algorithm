
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
    
        for(int i=0;i<commands.length;i++){
            
            int start = commands[i][0];
            int end = commands[i][1];
            int size = end-start+1;
            
            int[] arr=new int[size];
            
            for(int j=0;j<=size-1;j++){
                arr[j]=array[start+j-1];
            }
            Arrays.sort(arr);
            answer[i]= arr[commands[i][2]-1];
        }
       
        

        
        
        
        return answer;
    }
}