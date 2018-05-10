
package examenprimerparcial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
    
        Scanner entrada = new Scanner(System.in);
        double x, y,z, m;
    
        System.out.println("Ingrese el valor para X");
        x=entrada.nextDouble();
    
        System.out.println("Ingrese el valor para Y");
        y=entrada.nextDouble();
    
        System.out.println("Ingrese el valor para Z");
        z=entrada.nextDouble();
    
        m= (x+(y/z))/(x-(y/z));
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
        System.out.println("Da como resultado M =" + m);
    
    
    
    }
    
}
