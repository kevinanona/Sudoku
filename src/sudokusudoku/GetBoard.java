/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusudoku;
import java.util.Scanner;

/**
 *
 * @author k_ell
 */
public class GetBoard {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = scan.nextInt();
        System.out.println("Enter the column");
        int column = scan.nextInt();

        SudokuBoard SB = new SudokuBoard();
        SB.setFields();

        System.out.println(SB.getIndex(row, column));
        //Imraan was here
        //dfsgjfkdlsg
    }

}
