package Problem1008;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mateus Gabi
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        
        int numero = Integer.parseInt(s.next());
        int horasDeTrabalho = Integer.parseInt(s.next());
        double valorDaHora = Double.parseDouble(s.next());

        double salario = horasDeTrabalho * valorDaHora;
        
        System.out.printf("NUMBER = %d\n", numero); 
        System.out.printf("SALARY = U$ %.2f\n", salario);        
        
    }
    
}
