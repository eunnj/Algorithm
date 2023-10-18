import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        String word="";
        String prev = words[0];
        list.add(prev);
        answer[0]=0;
        answer[1]=0;
        
        for(int i=1;i<words.length;i++){
            word = words[i];
            if( list.contains(word) || prev.charAt(prev.length()-1)!=word.charAt(0)){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }else{
                list.add(word);
            }
            prev=word;
        }

        return answer;
    }
}