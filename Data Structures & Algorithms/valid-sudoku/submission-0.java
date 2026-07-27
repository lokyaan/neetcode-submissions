class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows= new HashSet[9];
        Set<Character>[] columns= new HashSet[9];
        Set<Character>[] boxes= new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i]= new HashSet<>();
            columns[i]= new HashSet<>();
            boxes[i]= new HashSet<>();
        }

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char value= board[row][col];
                if(value=='.') continue;

                int boxIndex= (row/3)*3 + col/3;

                if(!rows[row].add(value)) return false;
                if(!columns[col].add(value)) return false;
                if(!boxes[boxIndex].add(value)) return false;
            }
        }
        return true;
        
    }
}
