public class Solution {
    public int islandPerimeter(int[][] grid) {
        int c = 0;
        if(grid==null || grid.length==0 || grid[0].length==0) return 0;
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++)
                if(grid[i][j]==1)
                    c+=surrd(grid,i,j);
        return c;
    }
    public int surrd(int[][] grid, int x, int y){
        int count = 0;
        if(x==0) count++;
        else if(grid[x-1][y]==0) count++;
        if(x==grid.length-1) count++;
        else if(grid[x+1][y]==0) count++;
        if(y==0) count++;
        else if(grid[x][y-1]==0) count++;
        if(y==grid[0].length-1) count++;
        else if(grid[x][y+1]==0) count++;
        return count;
    }
}
// 数组，length 和 二维数组长度/上下界