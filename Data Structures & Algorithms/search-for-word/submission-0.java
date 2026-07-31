class Solution {

    public boolean exists(char[][] board,char[] words, int i, int j, int index){
        if(index== words.length) return true;
        if(i<0 || i>= board.length || j <0 || j>=board[0].length || board[i][j]!=words[index] || board[i][j]=='*'){
            return false;
        }

        char ch= board[i][j];
        board[i][j]='*';

        boolean res= exists(board, words, i+1,j,index+1)||
                    exists(board, words, i-1,j,index+1)||
                    exists(board, words, i,j+1,index+1)||
                    exists(board, words, i,j-1,index+1);
        board[i][j]=ch;
        return res;
    }
    public boolean exist(char[][] board, String word) {

        char words[]= word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==words[0] && exists(board,words,i,j,0)){
                    return true;
                }
            }
        }
        return false;
        
    }
}
