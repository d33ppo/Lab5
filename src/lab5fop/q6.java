/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5fop;
import java.util.Scanner;
/**
 *
 * @author hanan
 */
public class q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Enter the number of row(s) of Pascal Triangle to generate: ");
        int row = x.nextInt();
        System.out.println("The Pascal Triangle with "+row+" row(s)");
        
        int[][] pascal = new int [row][row];
        for (int i = 0; i < row; i++){
            pascal[i][0] = 1;
            for (int j = 1; j <= i; j++)
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
        }
        System.out.printf("The Pascal Triangle with %d row(s)\n", row);
        for (int[] rows : pascal) {
            for (int i : rows)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}   
