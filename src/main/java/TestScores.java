
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
public class TestScores {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       
        System.out.println("Please enter first test score");
        double firstTestScore = keyboard.nextDouble();
         System.out.println("Please enter second test score");
        double secondTestScore = keyboard.nextDouble();
         System.out.println("Please enter third test score");
        double thirdTestScore = keyboard.nextDouble();
        double testAvg = (firstTestScore + secondTestScore+thirdTestScore)/3 ;
        if (testAvg>=90){
            System.out.println("The test average is a A and the average is " + testAvg + "%");
        }
        if (testAvg>=80 && testAvg<90){
            System.out.println("The test average is a B and the average is " + testAvg + "%");
    }
        if (testAvg>=70 && testAvg<80){
            System.out.println("The test average is a B and the average is " + testAvg + "%");
    }
        if (testAvg>=60 && testAvg<70){
            System.out.println("The test average is a C and the average is " + testAvg + "%");
            
    }
        if (testAvg>=60 && testAvg<70){
            System.out.println("The test average is a D and the average is " + testAvg + "%");
    }
        if (testAvg<60){
            System.out.println("The test average is a F and the average is " + testAvg +"%");
    }
}
}
