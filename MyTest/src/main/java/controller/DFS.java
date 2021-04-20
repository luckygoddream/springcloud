package controller;

/**
 * @Author jwq
 * @Date 2021/4/20 11:59
 */
/**
 * Given an m x n 2d grid map of '1's (land) and '0's (water), return the number of islands which the sum of 1‘s on the island equal S (S>0).
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 * Example 1:
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ], S = 9
 * Output: 1
 * public int sumIslands(char[][] grid, int S){
 *     // implementation
 * }
 * //----------
 * // unit test
 * //----------
 * Tip: using Junit4.
 * public void sumIslandsTest(){
 *     char[][] grid = [
 *     ["1","1","1","1","0"],
 *     ["1","1","0","1","0"],
 *     ["1","1","0","0","0"],
 *     ["0","0","0","0","0"]
 *     ];
 *     int S = 8;
 *     // test implementation
 * }
 * */
public class DFS {
    public static int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){//表示是第一个1，进行加一
                    dfs(grid, i, j);//进行深度优先搜索
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;//数组越界
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }

    public static void main(String[] args) {
        char [][] grid= {{'1','1','1','1','0'},
                         {'1','1','0','1','0'},
                         {'1','1','0','0','0'},
                         {'0','0','0','0','0'}};

        char [] [] grids = {{'1','1','0','0','0'},
                            {'1','1','0','0','0'},
                            {'0','0','1','0','0'},
                            {'0','0','0','1','1'}};
        int i = numIslands(grid);
        System.out.println(i);
        System.out.println(numIslands(grids));
    }
}
