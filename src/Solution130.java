import java.util.ArrayList;
import java.util.List;

public class Solution130 {
    int mini = 0;
    int minj = 0;
    int maxi;
    int maxj;
    boolean falg = false;
    List<Integer> listi = new ArrayList<>();
    List<Integer> listj = new ArrayList<>();

    public void dfs(int i, int j, char[][] board, boolean[][] visted) {
        if ((i == mini || i == maxi || j == 0 || j == maxj) && board[i][j] == 'O')
            falg = true;
        if (i - 1 >= 0 && visted[i - 1][j] == false && board[i - 1][j] == 'O') {
            visted[i - 1][j] = true;
            dfs(i - 1, j, board, visted);
            listi.add(i - 1);
            listj.add(j);
        }
        if (i + 1 <= maxi && visted[i + 1][j] == false && board[i + 1][j] == 'O') {
            visted[i + 1][j] = true;
            dfs(i + 1, j, board, visted);
            listi.add(i + 1);
            listj.add(j);
        }
        if (j - 1 >= 0 && visted[i][j - 1] == false && board[i][j - 1] == 'O') {
            visted[i][j - 1] = true;
            dfs(i, j - 1, board, visted);
            listi.add(i);
            listj.add(j - 1);
        }
        if (j + 1 <= maxj && visted[i][j + 1] == false && board[i][j + 1] == 'O') {
            visted[i][j + 1] = true;
            dfs(i, j + 1, board, visted);
            listi.add(i);
            listj.add(j + 1);
        }
        return;
    }

    public void solve(char[][] board) {
        if (board == null)
            return;
        if (board.length == 0)
            return;
        if (board[0].length == 0)
            return;
        maxi = board.length - 1;
        maxj = board[0].length - 1;
        boolean visted[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (visted[i][j] == false && board[i][j] == 'O') {
                    listj.add(j);
                    listi.add(i);
                    System.out.println(i+"         "+j);
                    visted[i][j] = true;
                    dfs(i, j, board, visted);
                    if (falg == false) {
                        for (int k = 0; k < listi.size(); k++) {
                            board[listi.get(k)][listj.get(k)] = 'X';
                        }
                    }
                    falg = false;
                }
                listj.clear();
                listi.clear();
            }
        }
    }

}


//    public static void main(String[] args) {
//        Solution130 solution130 = new Solution130();
//        solution130.solve(new char[][]{
//                {'X', 'X', 'X', 'X'},
//                {'X', 'O', 'O', 'X'},
//                {'X', 'X', 'O', 'X'},
//                {'X', 'O', 'X', 'X'},});
//    }