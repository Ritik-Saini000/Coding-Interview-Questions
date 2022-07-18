import java.util.HashSet;

public class Valid_Sudoku {
		static boolean isValidSudoku(char[][] board) {
	      HashSet<String> map = new HashSet<>();
	      for(int i = 0; i < 9; i ++) {
	        for(int j = 0; j < 9; j ++) {
	          if(board[i][j] != '.') {
	            char number = board[i][j];
	            if(!map.add(number + "in row" + i) 
	               || !map.add(number + "in column" + j) 
	               || !map.add(number + "in block" + i / 3 + "-" + j / 3))
	              return false;
	          }
	        }
	      }
	      return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
		System.out.println(isValidSudoku(board));
	}

}
