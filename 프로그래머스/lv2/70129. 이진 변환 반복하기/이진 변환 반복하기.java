class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        // [이진 변환 과정 수, 제거된 1의 개수]
        int cnt = 0; // 이진 변환 과정 수
        int zero_cnt = 0; // 제거된 1의 개수
        
        while(!s.equals("1")){
            int one_cnt = 0;
            
            
            for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='1') one_cnt++;
            else zero_cnt++;
            }
        
            s = Integer.toBinaryString(one_cnt);
            
            cnt++;
        }
        
        answer[0]=cnt;
        answer[1]=zero_cnt;        
        
        
        
        return answer;
    }
}