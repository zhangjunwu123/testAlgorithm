package 图;
/**
 * 给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 * 示例 1：
 * 输入：board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
 * 输出：[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
 * 解释：被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
 * 示例 2：
 * 输入：board = [["X"]]
 * 输出：[["X"]]
 *
 * */
public class 被围绕的区域 {
    /**
     * 任何边界上的 O 都不会被填充为 X。 我们可以想到，所有的不被包围的 O 都直接或间接与边界上的 O 相连。我们可以利用这个性质判断 O 是否在边界上，具体地说：
     * 对于每一个边界上的 O，我们以它为起点，标记所有与它直接或间接相连的字母 O；
     * 最后我们遍历这个矩阵，对于每一个字母：
     * 如果该字母被标记过，则该字母为没有被字母 X 包围的字母 O，我们将其还原为字母 O；
     * 如果该字母没有被标记过，则该字母为被字母 X 包围的字母 O，我们将其修改为字母 X。
     * */
    public void solve(char[][] board){
        if(board == null){ return;}

        int n = board.length;
        int m = board[0].length;
        //首先遍历边界，吧边界为0且与他相关的的0都标记为A
        for(int i=0; i< n; i++){
            dfs(board,i,0);
            dfs(board,i,m-1);
        }
        for(int j=0; j< m; j++){
            dfs(board,0,j);
            dfs(board,n-1,j);
        }

        //最后遍历整个
        for(int i=0; i< n; i++){
            for(int j=0; j< m; j++){
                if(board[i][j] == 'A'){
                    board[i][j] = 'O';
                }else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

    }
    /** 给与边界O及边界O相关的0标记为A,
     * x 是高度坐标
     * y 是宽度坐标
     * */
    private void  dfs(char[][] board, int x, int y) {
        if(x < 0 || x>=board.length || y<0 || y >= board[0].length || board[x][y] != 'O'){
            return;
        }
        board[x][y] = 'A';
        dfs(board, x-1, y);
        dfs(board, x+1, y);
        dfs(board, x, y-1);
        dfs(board, x, y+1);
    }

}
