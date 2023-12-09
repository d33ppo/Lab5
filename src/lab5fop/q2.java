/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5fop;
import java.util.Arrays;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author hanan
 */
public class q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int [10];
        
        number[0] = rand.nextInt(21);
        for (int i = 1; i < 10; i++) {
            if(number[i]!=number[i-1]){
                number[i]=rand.nextInt(21);
            }
        }
        for(int value: number){
            System.out.print(value+" ");
    }
    }   
}
