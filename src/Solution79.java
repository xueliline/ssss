public class Solution79 {
    private boolean[][] visted;
    int maxi;
    int maxj;
    int mini;
    int minj;

    private boolean order(int i, int j, char[][] board, String word, int index) {
        if (index >= word.length())
        return true;
        if (board[i][j] != word.charAt(index))
            return false;
        boolean res1;

        if (i + 1 <=maxi) {
            System.out.println(i+" "+j);
            if (visted[i + 1][j] == false) {
                visted[i + 1][j] = true;
                res1 = order(i + 1, j, board, word, index + 1);
                visted[i + 1][j] = false;
                if (res1 == true)
                    return true;
            }
        }
        if (i - 1 >= mini) {
            if (visted[i - 1][j] == false) {
                visted[i - 1][j] = true;
                res1 = order(i - 1, j, board, word, index + 1);
                visted[i - 1][j] = true;
                if (res1 == true)
                    return true;
            }
        }
        if (j - 1 >= minj) {
            if (visted[i][j - 1] == false) {
                visted[i][j - 1] = true;
                res1 = order(i, j - 1, board, word, index + 1);
                visted[i][j - 1] = false;
                if (res1 == true)
                    return true;
            }
        }
        if (j + 1 <=maxj) {
            if (visted[i][j + 1] == false) {
                visted[i][j + 1] = true;
                res1 = order(i, j + 1, board, word, index + 1);
                visted[i][j + 1] = false;
                if (res1 == true)
                    return true;
            }
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        mini = minj = 0;
        maxi = board.length-1;
        maxj = board[0].length-1;
        visted = new boolean[maxi+1][maxj+1];
        for (int i = 0; i < maxi+1; i++) {
            for (int j = 0; j < maxj+1; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if(word.length()==1)
                        return true;
                    visted[i][j] = true;
                    boolean res = order(i, j, board, word, 0);
                    visted[i][j]=false;
                    if(res==true) {
                        return res;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution79 solution79 = new Solution79();
        char[][] res = {
                {'a'}};
        boolean rrr=solution79.exist(res, "a");
        System.out.println("结束-------------");
    }
}