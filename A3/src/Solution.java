import java.util.Scanner;


/**
 * Created by poon. on 5/11/2017 AD.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        // Times
        int T = in.nextInt();

        char[][] grid = new char[row][col];

        for (int i = 0; i < grid.length; i++) {
            String strIn = in.next();
            for (int j = 0; j < grid[0].length ; j++) {
                grid[i][j] = strIn.charAt(j);
            }


        }
        printGrid(grid, T);

    }


    public static void printGrid(char[][] grid, int times){
        int row = grid.length;
        int col = grid[0].length;
        char[][] oneSecpass = new char[row][col];
        char[][] twoSecpass = new char[row][col];
        char[][] threeSecpass = new char[row][col];

        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]);

            }
            System.out.println();
        }


    }
    public static void BOOOOM(char[][] g, int post_row, int post_col){
        g[post_row][post_col] = '.';

        if (inGrid(g,post_row -1,post_col))
            g[post_row-1][post_col] = '.';

        if (inGrid(g,post_row +1,post_col))
            g[post_row+1][post_col] = '.';

        if (inGrid(g,post_row ,post_col -1))
            g[post_row][post_col-1] = '.';

        if (inGrid(g,post_row ,post_col+1))
            g[post_row][post_col+1] = '.';

    }
    public static void addBomb(char[][]g){

    }

    public static boolean inGrid(char[][] g, int row, int col){
        return (row >= 0 &&row < g.length) && (col>=0 && col < g[0].length);
    }
}
