/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5fop;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hanan
 */
public class Lab5fop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner student = new Scanner(System.in);
        Random number = new Random();
       
        System.out.println("Enter number of students: ");
        int num = student.nextInt();
        int[] marks = new int [num];
        
        for (int i = 0; i < num; i++) {
            marks[i] = number.nextInt(101);
            System.out.print(marks[i]+" ");
        }
        int total = 0;
        for (int j = 0; j < num; j++) {
            total += marks[j];
        }
        System.out.println();
        int average = total/num;
        System.out.println(average+" is the average");
        
        int min = marks[0];
        int max = marks[0];

        // Iterate through the array to find min and max
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }

            if (marks[i] > max) {
                max = marks[i];
            }
        }

        // Display the results
        
        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);
    }
    
}
