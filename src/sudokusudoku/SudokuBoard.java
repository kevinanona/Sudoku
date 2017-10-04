/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusudoku;
import java.util.Random;

/**
 *
 * @author k_ell
 */
public class SudokuBoard{
    private static Random random = new Random();
    private static int randomBoard[][] = new int[9][9];

    private static int board[][] =

                {{2, 9, 6, 3, 1, 8, 5, 7, 4},
                {5, 8, 4, 9, 7, 2, 6, 1, 3},
                {7, 1, 3, 6, 4, 5, 2, 8, 9},
                {3, 2, 5, 8, 9, 7, 3, 4, 1},
                {9, 3, 1, 4, 2, 6, 8, 5, 7},
                {4, 7, 8, 5, 3, 1, 9, 2, 6},
                {1, 6, 7, 2, 5, 3, 4, 9, 8},
                {8, 5, 9, 7, 6, 4, 1, 3, 2},
                {3, 4, 2, 1, 8, 9, 7, 6, 5}};


    public int getIndex(int row, int column)
    {
        //return board[row][column]; //board
        return randomBoard[row][column]; //randomBoard
    }

    public static void setFields()
    {
        int count = 0;

        for (int row = 0; row<9; row++)
        {
            for (int column = 0; column<9; column++)
            {
                int attempts = 0;
                count++;
                int ranNum = random.nextInt(9)+ 1;

                //for(int i = 0; i<9; i++)
                //{
                while
                 (ranNum == randomBoard[row][0] || ranNum == randomBoard[row][1] || ranNum == randomBoard[row][2] ||
                  ranNum == randomBoard[row][3] || ranNum == randomBoard[row][4] || ranNum == randomBoard[row][5] ||
                  ranNum == randomBoard[row][6] || ranNum == randomBoard[row][7] || ranNum == randomBoard[row][8] ||
                  ranNum == randomBoard[0][column] || ranNum == randomBoard[1][column] || ranNum == randomBoard[2][column] ||
                  ranNum == randomBoard[3][column] || ranNum == randomBoard[4][column] || ranNum == randomBoard[5][column] ||
                  ranNum == randomBoard[6][column] || ranNum == randomBoard[7][column] || ranNum == randomBoard[8][column])
                {
                    if(ranNum<9)
                    {
                        ranNum++;
                        attempts++;
                    }
                    else
                    {
                        ranNum = 1;
                        attempts++;
                    }
                    System.out.println("r" + ranNum);

                }
                //}
                randomBoard[row][column] = ranNum;
                System.out.println("c" + count + " has " + ranNum);

            }
        }
        //return randomBoard;
    }

    private static void displayRandom()
    {
        setFields();

        for (int row = 0; row<9; row++)
        {
            for (int column = 0; column<9; column++)
            {
                System.out.print(randomBoard[row][column]);
                System.out.print(", ");
            }
            System.out.println("");
        }
    }
    public static void main( String[] args )
    {
        displayRandom();
    }
}
