/*
* The formula to calculate the area of a circumference is defined as A = π . R2.
* Considering to this problem that π = 3.14159:
*
* Calculate the area using the formula given in the problem description.
*
* Input
* 
* The input contains a value of floating point (double precision), that is the variable R.
*
* Output
*
* Present the message "A=" followed by the value of the variable, as in the
* example bellow, with four places after the decimal point. Use all double
* precision variables. Like all the problems, don't forget to print the end of
* line after the result, otherwise you will receive "Presentation Error".
 */
package Problem1002;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mateus Gabi
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        
        double R = s.nextDouble();
        
        double pi = 3.14159;        
        double A = R * R * pi;
                
        System.out.printf("A=%.4f\n", A);
        
    }
    
}