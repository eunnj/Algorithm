import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int cnt=0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
       
        
        // 여벌 옷 있는 학생이 도난당한 경우
        for(int i=0;i<lost.length;i++){
            int num = lost[i];
            for(int j=0;j<reserve.length;j++){
                if(num==reserve[j]){
                    cnt++;
                    lost[i]=-1;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        
        // 체육복 빌려주는 경우
        for(int i=0;i<lost.length;i++){
            int num = lost[i];
            for(int j=0;j<reserve.length;j++){
                if(num==reserve[j]-1||num==reserve[j]+1){
                    cnt++;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        
        answer = n -lost.length + cnt;
        return answer;
    }
}