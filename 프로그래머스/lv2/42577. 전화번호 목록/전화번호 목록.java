import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        
        for(String phone:phone_book){
            set.add(phone);
        }
        
         for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if(set.contains(phone.substring(0,i))){
                    return false;
                }
            }
        }
       
        return answer;
    }
}