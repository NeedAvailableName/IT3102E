package week5.OtherProjects.hust.soict.ictglobal.lab01;

import javax.swing.JOptionPane;
import java.lang.Math;
public class Equation {
    public static void main(String[] args) {
        String[] options = new String[] {
            "First-degree equation with one variable", 
            "First-degree equation with two variables", 
            "Second-degree equation with one variable"
        };
        int response = JOptionPane.showOptionDialog(null, "Choose type of equation", "Caculator",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        if(response == 0) {
            String str = JOptionPane.showInputDialog(null, "Please input a and b in ax+b=0 (a!=0): ");
            String[] substr = str.split(" ");
            Double a = Double.parseDouble(substr[0]);
            Double b = Double.parseDouble(substr[1]);
            JOptionPane.showMessageDialog(null, "The solution is: " + (-b/a));
        }
        if(response == 1) {
            String str = JOptionPane.showInputDialog(
                null,
                "Please input a11 a12 b1 a21 a22 b2 in a11x1 + a12x2 = b1 || a21x1 + a22x2 = b2"
            );
            String[] substr = str.split(" ");
            Double a11 = Double.parseDouble(substr[0]);
            Double a12 = Double.parseDouble(substr[1]);
            Double b1 = Double.parseDouble(substr[2]);
            Double a21 = Double.parseDouble(substr[3]);
            Double a22 = Double.parseDouble(substr[4]);
            Double b2 = Double.parseDouble(substr[5]);
            Double D = a11*a22 - a21*a12;
            Double D1 = b1*a22 - b2*a12;
            Double D2 = a11*b2 - a21*b1;
            if(D != 0) {
                JOptionPane.showMessageDialog(null, "Solution is: x1 = " + (D1/D) + " and x2 = " + (D2/D));
            }
            else {
                if(D1 == 0 && D2 == 0) {
                    JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No solution");
                }
            }
        }
        if(response == 2) {
            String str = JOptionPane.showInputDialog(null, "Please input a b c in ax^2 + bx + c = 0");
            String[] substr = str.split(" ");
            Double a = Double.parseDouble(substr[0]);
            Double b = Double.parseDouble(substr[1]);
            Double c = Double.parseDouble(substr[2]);
            Double Delta = (b*b - 4*a*c);
            if(Delta < 0) {
                JOptionPane.showMessageDialog(null, "No solution");
            }
            if(Delta == 0) {
                JOptionPane.showMessageDialog(null, "The equation has double root: " + (-b/(2*a)));
            }
            else {
                JOptionPane.showMessageDialog(null, "The equation has two distinct roots: " 
                    + ((-b+Math.sqrt(Delta))/(2*a)) + " and " + (-b-Math.sqrt(Delta))/(2*a));
            }
        }
    }
}
