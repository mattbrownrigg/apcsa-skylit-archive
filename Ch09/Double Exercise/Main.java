
/**
 * This is the revised ver.
 *
 * @Matthew Brownrigg (your name)
 * @0.1v (a version number or a date)
 */

import java.awt.Color;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Color[][] board = new Color[10][10];
        String[][] testBoard = new String[10][10];
        double[][] m1 = {{5.0, 6.0, 7.0, 8.0, 9.0},
                        {5.0, 6.0, 7.0, 8.0, 9.0} };
        double[][] m2 = {{1.0, 2.0, 3.0, 4.0, 5.0},
                        {1.0, 2.0, 3.0, 4.0, 5.0} };
                        
        double[][] m4 = {{5.0, 6.0, 7.0, 8.0, 9.0},
                        {5.0, 6.0, 7.0, 8.0, 9.0} };
        double[][] m3 = {{1.0, 2.0, 3.0, 4.0, 5.0},
                        {1.0, 2.0, 3.0, 4.0, 5.0} };
        
        System.out.println("Q15 with COLOR-------------------------------");
        fillCheckerboard(board);
        System.out.println("Q15 with STRING-------------------------------");
        testFillCheckerboard(testBoard);
        System.out.println("-------------------------------");
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(testBoard));
        System.out.println("-------------------------------");
        System.out.println("Q16 m1 > m2-------------------------------");
        System.out.println(covers(m1, m2));
        System.out.println("Q16 m3 < m4-------------------------------");
        System.out.println(covers(m3, m4));
        System.out.println("Q20 with 11-------------------------------");
        pascalTriangle(11);
    }
    
    public static void fillCheckerboard(Color[][] board)
    {
        for(int r = 0; r < board.length; r++)
        {
            int shift = 0;
            if(r % 2 == 0)
                shift = 1;
            for(int white = 0 + shift; white < board[0].length; white += 2)
            {
                board[r][white] = Color.WHITE;
            }
        }
        for(int r = 0; r < board.length; r++)
        {
            int shift = 0;
            if(r % 2 == 0)
                shift = 1;
            for(int black = 1 - shift; black < board[0].length; black += 2)
            {
                board[r][black] = Color.BLACK;
                
            }
            System.out.println(Arrays.deepToString(board[r]));
        }
    }
    
    public static void testFillCheckerboard(String[][] testBoard)
    {
        for(int r = 0; r < testBoard.length; r++)
        {
            int shift = 0;
            if(r % 2 == 0)
                shift = 1;
            for(int white = 0 + shift; white < testBoard[0].length; white += 2)
            {
                testBoard[r][white] = ".";
            }
            //System.out.println(Arrays.deepToString(testBoard[r]));
        }
        for(int r = 0; r < testBoard.length; r++)
        {
            int shift = 0;
            if(r % 2 == 0)
                shift = 1;
            for(int black = 1 - shift; black < testBoard[0].length; black += 2)
            {
                testBoard[r][black] = "x";
                
            }
            System.out.println(Arrays.deepToString(testBoard[r]));
        }
    }
    
    private static boolean covers(double[][] m1, double[][] m2)
    {
         int count = 0;
         int nRows = m1.length; 
         int nCols = m1[0].length;
         for (int r = 0; r < nRows; r++) 
            for (int c = 0; c < nCols; c++)
                if (m1[r][c] > m2[r][c])
                    count++;
         return 2 * count >= nRows * nCols;
         // return count >= nRows * nCols / 2 doesn’t work, 
         // for example, nRows = 3, nCols = 3, count = 4
    }
    
    public static int[][] pascalTriangle(int n)
    {
        int[][] pascalTriangle = new int[n][n];
        //pascalTriangle[0][n/2] = 1;
        //System.out.println(Arrays.toString(pascalTriangle[0]));
        int no_row = n,c=1,blk,i,j;
        
        int[][] pascal = new int[n+1][];
        for(int k = 0; k < n + 1; k++)
        {
            pascal[k] = new int[k+1];
        }
        
        for(i=0;i<no_row;i++)
        {
            int count = 0;
            for(blk = 1; blk <= no_row - i; blk++)
                System.out.print(" ");
            for(j=0; j<=i; j++)
            {
                if (j==0 || i==0)
                    c=1;
                else
                    c=c*(i - j + 1) / j;
                //System.out.print(" " + c);
                pascal[i][j] = c;
            }
            //System.out.print("\n");
            System.out.println(Arrays.toString(pascal[i]));
        }
        return pascalTriangle;
    }
}
