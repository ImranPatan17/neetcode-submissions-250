class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (row.contains(board[i][j]))
                    return false;
                row.add(board[i][j]);
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> col = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.')
                    continue;
                if (col.contains(board[j][i]))
                    return false;
                col.add(board[j][i]);
            }
        }

        for (int k = 0; k < 9; k++) {
            Set<Character> sqr = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row =(k/3)*3 +i;
                    int col =(k%3)*3 +j;
                    if(board[row][col] == '.')
                        continue;
                    if(sqr.contains(board[row][col]))
                        return false;
                    sqr.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
