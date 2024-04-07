package 图;
/**
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 * 示例 1：
 * 输入：grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * 输出：1
 * 示例 2：
 * 输入：grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * 输出：3
 * */
public class 岛屿数量 {

    public int numsIsland(char[][] grid){
        int height = grid.length;
        int width = grid[0].length;
        int nums = 0;
        for(int i=0; i< height; i++){
            for(int j=0; j<width; j++){
                if(grid[i][j] == '1'){
                    nums++;
                    dfsIsland(grid, i, j);
                }
            }
        }
        return nums;
    }

    public void dfsIsland(char[][] grid, int i, int j){

        if(i < 0 || j<0 || i>= grid.length || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfsIsland(grid, i-1, j);
        dfsIsland(grid, i+1, j);
        dfsIsland(grid, i, j -1);
        dfsIsland(grid, i, j+1);
    }

}
