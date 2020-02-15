import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachkorte
 */
public class BankCharges {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please number of checks written this month");
        double checksWritten = keyboard.nextDouble();
       
        
        if (checksWritten<20){
            double checksVariableCharge = checksWritten * .1;
            System.out.println("Your bank charges for this month is $" + (checksVariableCharge +10 ));
    }
        if (checksWritten>=20 && checksWritten<40){
             double checksVariableCharge = checksWritten * .08;
             System.out.println("Your bank charges for this month is $" + (checksVariableCharge +10));
        }
          
        
        
        if (checksWritten>=40 && checksWritten<60){
            double checksVariableCharge = checksWritten * .06;
            System.out.println("Your bank charges for this month is $" + (checksVariableCharge +10));
    }
        
        
        if (checksWritten>=60){
             double checksVariableCharge = checksWritten * .04;
            System.out.println("Your bank charges for this month is $" + (checksVariableCharge +10));
    }
}
}
