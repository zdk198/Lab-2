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
public class BarChart {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
      int numberOfStores = 5;
      String userStringInput;
      double storeSales;
      int numberOfHundredDollarDivisons;
      String outputString = "SALES BAR CHART\n";
      for(int store =1; store <= numberOfStores; store++){
          userStringInput= JOptionPane.showInputDialog("Enter today's sales for store" + store);
          storeSales= Double.parseDouble(userStringInput);
          numberOfHundredDollarDivisons = (int)(storeSales/100);
          outputString+="Store " + store + ": ";
          for(int printerAsterisk = 1; printerAsterisk <= numberOfHundredDollarDivisons; printerAsterisk++) {
              outputString += "*";
          }
          outputString += "\n";
      }
      JOptionPane.showMessageDialog(null, outputString);
      System.exit( 0 );
        

    }
}
