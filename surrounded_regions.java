
public class surrounded_regions {
    public static void main(String[] args) {
        System.out.println("Simple DFS mark all regions surrounding border cell with O with E in final loop if we find E put O else X");
    }
}

class ans {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0){
            return;
        }
        for(int i = 0; i <= board.length - 1; i++){
            dfs(board, i, 0);
            dfs(board, i, board[0].length - 1);
        }
        for(int j = 0; j <= board[0].length - 1; j++){
            dfs(board, 0, j);
            dfs(board, board.length - 1, j);
        }
        for(int i = 0; i <= board.length - 1; i++){
            for(int j = 0; j <= board[0].length - 1; j++){
                if(board[i][j] == 'E'){
                    board[i][j] = 'O';
                }else{
                    board[i][j] = 'X';
                }
            }
        }
    }
    private void dfs(char[][] board, int r, int c){
        if(r < 0 || r > board.length - 1 || c < 0 || c > board[0].length - 1 || board[r][c] != 'O'){
            return;
        }
        board[r][c] = 'E';
        dfs(board, r + 1, c);
        dfs(board, r, c + 1);
        dfs(board, r - 1, c);
        dfs(board, r, c - 1);
    }
}