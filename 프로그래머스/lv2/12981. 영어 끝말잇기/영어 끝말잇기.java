import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int idx = 1; // 번호
        int cnt = 1; // 차례
        ArrayList<String> list = new ArrayList<>();
        char ch = words[0].charAt(0);
        //list.add(words[0]);
        
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(list.contains(word) || ch!=word.charAt(0)){ // 이전에 등장한 단어 or 끝말잇기 실패
                answer[0] = idx;
                answer[1] = cnt;
                break;
            }
            list.add(word);
            ch = word.charAt(word.length()-1);
            idx++;
            if(idx>n){
                idx=1;
                cnt++;
            }
            
        
        }

        return answer;
    }
}