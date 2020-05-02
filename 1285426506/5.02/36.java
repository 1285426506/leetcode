class Solution {
    public boolean isValidSudoku(char[][] board) {
      int[][] row = new int[9][10];
      int[][] col = new int[9][10];
      int[][] box = new int[9][10];
      for(int i = 0;i<board.length;i++){
        for(int j = 0;j< board[i].length;j++){
            if(board[i][j]=='.'){
              continue;
            }
            int temp = board[i][j]-'0';
            row[i][temp]++;
            col[j][temp]++;
            box[(i/3)*3+(j/3)][temp]++;
            if(row[i][temp]+col[j][temp]+box[(i/3)*3+(j/3)][temp]>3){
               return false;
            }
        }
      }
      return true;
    }
}