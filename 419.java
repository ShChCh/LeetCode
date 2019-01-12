public class Solution {
    public void mark(char[][] board, char[][] colorBoard, int i, int j, char count){
        boolean flag = false;
        colorBoard[i][j] = count;
        if((i>0 && board[i-1][j]=='X') || (i<board.length-1 && board[i+1][j]=='X')) flag = true;
        if(flag){
            if(i>0 && board[i-1][j]=='X' && colorBoard[i-1][j]==0) mark(board, colorBoard, i-1, j, count);
            if(i<board.length-1 && board[i+1][j]=='X'  && colorBoard[i+1][j]==0) mark(board, colorBoard, i+1, j, count);
        }
        else{
            if(j>0 && board[i][j-1]=='X'  && colorBoard[i][j-1]==0) mark(board, colorBoard, i, j-1, count);
            if(j<board[0].length-1 && board[i][j+1]=='X'  && colorBoard[i][j+1]==0) mark(board, colorBoard, i, j+1, count);
        }
    }
    
    public int countBattleships(char[][] board) {
        char count = 1;
        char[][] colorBoard = new char[board.length][board[0].length];
        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++)
                colorBoard[i][j] = 0;
        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++){
                if(colorBoard[i][j]==0 && board[i][j]=='X'){
                    mark(board, colorBoard, i, j, count);
                    count ++;
                }
            }
        return (int)(count-1);
    }
}
// array, mark, no follow up finished.