package Problem1009;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mateus Gabi
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        
        String nome = s.next();
        
        double salario = Double.parseDouble(s.next());
        double vendas = Double.parseDouble(s.next());
        
        double salarioFinal = salario + 0.15 * vendas;
        
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);        
        
    }
    
}
