package Problem1005;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mateus Gabi
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        
        double A = 3.5 / 11 * Double.parseDouble(s.next());
        double B = 7.5 / 11 * Double.parseDouble(s.next());
        
        double MEDIA = A + B;
        
        System.out.printf("MEDIA = %.5f\n", MEDIA);        
        
    }
    
}
