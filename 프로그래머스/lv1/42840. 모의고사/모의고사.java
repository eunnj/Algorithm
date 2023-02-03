import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
         int[] answer;
        
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        int score[] = new int[3];
        
        for(int i=0;i<answers.length;i++){
            if(answers[i]==p1[i%5]) score[0]++;
            if(answers[i]==p2[i%8]) score[1]++;
            if(answers[i]==p3[i%10]) score[2]++;
        }
        
        
        int max = Math.max(score[0],score[1]);
        max = Math.max(max,score[2]);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(score[0]==max) list.add(1);
        if(score[1]==max) list.add(2);
        if(score[2]==max) list.add(3);
        
        answer=new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}