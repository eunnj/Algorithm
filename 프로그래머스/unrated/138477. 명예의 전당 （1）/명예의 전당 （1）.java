import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i=0;i<score.length;i++){
            if(i<k){
                list.add(score[i]);
            }else{
                if(list.get(0)<score[i]){
                    list.set(0,score[i]);
                }
            }
            
            Collections.sort(list);
            answer[i]=list.get(0);
        }
        
        return answer;
    }
}