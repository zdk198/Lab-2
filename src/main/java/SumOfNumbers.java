import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachkorte
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a nonzero positive integer");
        int numberEntered = keyboard.nextInt();
        

        int totalSum = 0;
      for(int i = 1; i <= numberEntered; ++i)
        {
            // sum = sum + i;
            totalSum += i;
        }

       System.out.println("The sum of all numbers added together to the number entered is " + totalSum);
        
    }
}
