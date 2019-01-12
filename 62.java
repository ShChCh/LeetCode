class Solution {
    public int uniquePaths(int m, int n) {
        
    	if(m==1 || n==1)
    		return 1;
    	if(m<1 || n<1)
    		return 0;
    	int re = 0;
        int[][] board = new int[n][m];
        for(int i=0; i<m; i++)
        	board[0][i] = 1;
        for(int i=0; i<n; i++)
        	board[i][0] = 1;
        
        for(int i=1; i<n; i++)
        	for(int j=1; j<m; j++)
        		board[i][j] = board[i-1][j] + board[i][j-1];
        
        return board[n-1][m-1];
    }
}