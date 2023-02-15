import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = new int[8];
        HashMap<Character,Integer> map = new HashMap<>();
        char[] type = {'R','T','C','F','J','M','A','N'}; 
        for(int i=0;i<8;i++){
            map.put(type[i],i);
        }
        
         for(int i=0; i<survey.length; i++){
            char ch1 = survey[i].charAt(0);
            char ch2 = survey[i].charAt(1);
            
             switch (choices[i]){
                case 1 : score[map.get(ch1)]+=3;
                         break;
                case 2 : score[map.get(ch1)]+=2;
                         break;
                case 3 : score[map.get(ch1)]+=1;
                         break;
                case 4 : break;
                case 5 : score[map.get(ch2)]+=1;
                         break;
                case 6 : score[map.get(ch2)]+=2;
                         break;
                case 7 : score[map.get(ch2)]+=3;
                         break;
                default : break;
            }      
        }
        
        for(int i=0;i<7;i+=2){
            if(score[i]>=score[i+1]){
                answer+=type[i];
            }else{
                answer+=type[i+1];
            }
        }
        
        return answer;
    }
}