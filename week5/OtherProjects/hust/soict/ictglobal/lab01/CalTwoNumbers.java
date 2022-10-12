package week5.OtherProjects.hust.soict.ictglobal.lab01;

import javax.swing.JOptionPane;
import java.lang.Math;
public class CalTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2, answer;
        strNum1 = JOptionPane.showInputDialog("Enter the first number: ");
        strNum2 = JOptionPane.showInputDialog("Enter the second number: ");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        answer = "The sum is: " + (num1+num2) + "\n";
        answer += "The different is: " + Math.abs(num1-num2) + "\n";
        answer += "The product is: " + (num1*num2) + "\n";
        if(num2 == 0) {
            answer += "Can not get the quotient";
        }
        else {
            answer += "The quotient is: " + (num1/num2);
        }
        JOptionPane.showMessageDialog(null, answer);
        System.exit(0);
    }
}
