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
public class q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random x = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employee: ");
        int n = sc.nextInt();
        int [] hour = new int[7];
        int[] total = new int[n];
        for(int j =0;j<n;j++){
            System.out.println("Employer "+(j+1)+": ");
            for(int i =0;i<7;i++){
                hour[i]=x.nextInt(8)+1;
                total[j] += hour[i];
                System.out.println("Day "+(i+1)+": "+hour[i]+" hours");
            }
            System.out.println("Total hours = "+total[j]+" hours");
            System.out.println();
        }
    }
    }
    

