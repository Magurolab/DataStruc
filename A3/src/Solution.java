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
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = strIn.charAt(j);
            }
        }
        char[][] s2 = gen_boom(row,col);
        char[][] s3 = gen_stage(grid);
        char[][] s5 = gen_stage(s3);

        if(T == 0 || T == 1)
            printGrid(grid);
        else if(T%2 == 0)
            printGrid(s2);

        else{
            if(T%4 == 1)
                printGrid(s5);
            else if (T%4 == 3)
                printGrid(s3);

        }


    }



    public static char[][] gen_boom(int row, int col){
        char[][] grid = new char[row][col];
        char O = 79;
            for (int i = 0; i <grid.length ; i++) {
                for (int j = 0; j < grid[0].length ; j++) {
                    grid[i][j] = O;
                }
            }
        return grid;
    }


    public static char[][] gen_stage(char[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        char O = 79;
        char[][] boomGird = gen_boom(row,col);

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == O){
                    boomGird[i][j] = '.';
                    if(in_grid(i-1,j,boomGird)){// from the top
                        boomGird[i-1][j] = '.';
                    }
                    if(in_grid(i+1,j,boomGird)){//from bot
                        boomGird[i+1][j] = '.';
                    }
                    if(in_grid(i,j-1,boomGird)){// from left
                        boomGird[i][j-1] = '.';
                    }
                    if(in_grid(i,j+1,boomGird)){// from right
                        boomGird[i][j+1] = '.';
                    }


                }
            }

        }
        return boomGird;
    }


    public static boolean in_grid(int x, int y, char[][] arr){
        return (x >= 0 && x < arr.length)&&(y >= 0 && y < arr[0].length);
    }

    public static void printGrid(char[][] a){
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);

            }
            System.out.println();

        }
    }

}


