
package examenprimerparcial;

import java.util.Scanner;

/*3.- Realizar un programa que permita ingresar un valor en segundos, luego realizar un proceso que 
permita presentar el valor en minutos y segundos del valor dado. Ejemplo:
100 segundos es igual a 1 minuto y 40 segundos
 */
public class Ejercicio3 {
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);

        double seg;
        double min;
        System.out.println("Ingrese el valor en segundos");
        seg = entrada.nextDouble();
        
        min= (seg /60);
        System.out.println(seg + " segundos es igual a " + min + " minutos ");
        

    }
    
}
