class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        

        for(int i=0; i<n; i++)
        { 
            for(int j=0; j<n; j++)
            {
                int cnt=0;
                for(int k=0; k<n; k++)
                {
                    if(grid[i][k] == grid[k][j]) cnt++;
                }
                if(cnt==n) ans++;    
            }             
        }
        
        return ans;
    }
}