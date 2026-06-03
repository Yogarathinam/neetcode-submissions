class Solution {
    public boolean isValidSudoku(char[][] board) {
        //to check all rows, 
        //we use 2 loops and check if element already exisit
        for(int i = 0; i<9; i++){
            HashSet<Character> rows = new HashSet<>();
            for(int j = 0; j< 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }

                if(rows.contains(board[i][j])){
                    return false;
                }
                rows.add(board[i][j]);
            }
        }

        //Same as row checking but with [j][i] to swapped to check cols
         for(int i = 0; i < 9; i++){
            HashSet<Character> cols = new HashSet<>();
            for(int j=0; j < 9; j++){
                if(board[j][i]=='.'){
                    continue;
                }

                if(cols.contains(board[j][i])){
                    return false;
                }
                cols.add(board[j][i]);

            }
        }
    //to check 3x3 boxes, we need to find the top corner(row+=3,col+=3)
    //then with that we can traverse like [i][j] where its row+i, col+j for each element

    for(int row = 0; row<9; row+=3){
        for(int col = 0; col<9; col+=3){
             HashSet<Character> box = new HashSet<>();

            for(int i = row; i< row+3;i++ ){
                for(int j = col; j< col+3; j++){

                   
                    if(board[i][j]=='.'){
                        continue;
                    }
                    if(box.contains(board[i][j])){
                        return false;
                    }
                    box.add(board[i][j]);
                }
            }


        }
    }

return true;

    }
}
