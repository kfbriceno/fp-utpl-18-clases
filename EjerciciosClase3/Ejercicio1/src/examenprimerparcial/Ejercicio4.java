
package examenprimerparcial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d, e, f, p, q;
        double x=0,y=0;
        
        System.out.println("Ingrese el valor de a");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor de c");
        c = entrada.nextDouble();
        System.out.println("Ingrese el valor de d");
        d = entrada.nextDouble();
        System.out.println("Ingrese el valor de e");
        e = entrada.nextDouble();
        System.out.println("Ingrese el valor de f");
        f = entrada.nextDouble();
        p=(a*x)+(b*y);
        q=(d*x)+(e*y);
        
        if((p== c)&&((q==f)){
            x=((c*e)-(b*f))/((a*e)-(b*d));
            
            else{
                    if((a*x) + (b*y) == c)&&((d*x) + (e*y) == f)){
                y=((c*e)-(b*f))/((a*e)-(b*d));  
            }
                    }
            
            
            
        }
        
    }
    
}
