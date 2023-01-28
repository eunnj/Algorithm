import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        Arrays.sort(score);
        
        
        if(len-m>0){
            for(int i=len-m;i>=0;i-=m){
                answer+=(score[i]*m);
            }
        }
        
        
        return answer;
    }
}