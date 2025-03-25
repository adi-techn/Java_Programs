public class sudoku{
     public static boolean sudokuSolver(int sudoku[][],int row,int col){     //Using recursion and backtracking
          //Base Case
          if(row==sudoku.length){      //Last cell 
               return true;
          }

          //Recursion
          int nextRow=row,nextCol=col+1;
          if(col+1==sudoku.length){
               nextRow=row+1;
               nextCol=0;
          }
          if(sudoku[row][col]!=0){
               return sudokuSolver(sudoku, nextRow, nextCol);
          }
          for(int digit=1;digit<=9;digit++){
               if(isSafe(sudoku, row, col,digit)){
                    sudoku[row][col]=digit;
                    if(sudokuSolver(sudoku, nextRow, nextCol)){
                         return true;
                    }
                    sudoku[row][col]=0;
               }
          }
          return false;
     }
     public static boolean isSafe(int sudoku[][],int row,int col,int digit){
          //Column Check
          for(int i=0;i<9;i++){
               if(sudoku[i][col]==digit){
                    return false;
               }
          }
          //Row Check
          for(int i=0;i<9;i++){
               if(sudoku[row][i]==digit){
                    return false;
               }
          }
          //Grid Check
          int sr=(row/3)*3;
          int sc=(row/3)*3;

          for(int i=sr;i<sr+3;i++){
               for(int j=sc;j<sc+3;j++){
                    if(sudoku[i][j]==digit){
                         return false;
                    }
               }
          }
          return true;
     }
     public static void main(String[] args) {
     }
}