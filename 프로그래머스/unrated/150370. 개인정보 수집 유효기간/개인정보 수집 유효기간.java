import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list=new ArrayList<>();
        int[] answer = {};
        String[] t=today.split("\\.");
        int todayCnt=Integer.parseInt(t[0])*12*28+Integer.parseInt(t[1])*28+Integer.parseInt(t[2]);
        
        Map<String, Integer> map=new HashMap<>();
        for(String i:terms){
            String [] a=i.split("\\s");
            map.put(a[0], Integer.parseInt(a[1]));
        }
        for(int i=0;i<privacies.length;i++){
            int year=Integer.parseInt(privacies[i].substring(0, 4));
            int month=Integer.parseInt(privacies[i].substring(5, 7));
            int day=Integer.parseInt(privacies[i].substring(8,10));
            String level=privacies[i].substring(11, 12);

            int lev =map.get(level);
            month+=lev;

            int temp=year*12*28+month*28+day-1;

            if(todayCnt>temp){
                list.add(i+1)  ;
            }
        }
        
        answer = new int[list.size()];
        
        for(int i=0;i<answer.length;i++)
            answer[i]=list.get(i);
        
        return answer;
    }
}