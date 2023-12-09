/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5fop;

/**
 *
 * @author hanan
 */
public class q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix = {{1,5,7},{3,6,9},{5,3,8}};
        
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 2; i >= 0; i--) {
            System.out.print(matrix[i][0]+" ");
        }
        System.out.println();
        for (int j = 2; j >= 0; j--) {
            System.out.print(matrix[j][1]+" ");
        }
        System.out.println();
        for (int k = 2; k >= 0; k--) {
            System.out.print(matrix[k][2]+" ");
        }
        System.out.println();
   }
    
}
