class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String str1 = "";
        String str2 = "";
        
        for(int i=0;i<n;i++){
             
             str1 = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i])));
             str2 = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr2[i])));
             String ret = "";
            
            for(int j=0;j<n;j++){
                char ch1 = str1.charAt(j);
                char ch2 = str2.charAt(j);
                
                if(ch1=='0'&&ch2=='0'){
                    ret+=" ";
                }else{
                    ret+="#";
                }
            }
            
            answer[i]=ret;
        }
        
        
        return answer;
    }
}