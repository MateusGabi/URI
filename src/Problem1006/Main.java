package Problem1006;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mateus Gabi
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        
        double A = Double.parseDouble(s.next());
        double B = Double.parseDouble(s.next());
        double C = Double.parseDouble(s.next());
        double D = Double.parseDouble(s.next());
        
        double MEDIA = A + B + C;
        
        System.out.printf("MEDIA = %.1f\n", MEDIA);        
        
    }
    
}
