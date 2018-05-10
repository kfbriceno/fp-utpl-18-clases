
package examenprimerparcial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int Mes= entrada.nextInt();
        System.out.println("Ingrese el numero de mes");
        String sMes;
        
            switch (Mes) {
                
                
                case 1: sMes = "El mes tiene 31 días";
                break;
                case 2:sMes = "El mes tiene 28 días (o 29 días si es año bisiesto)";
                break;			
                case 3:sMes = "El mes tiene 31 días";
                break;
                case 4:sMes = "El mes tiene 30 días";
                break;
                case 5:sMes = "El mes tiene 31 dias";
                break;
                case 6:sMes = "El mes tiene 30 dias";
                break;
                case 7:sMes = "El mes tiene 31 dias";
                break;
                case 8:sMes = "El mes tiene 31 dias";
                break;
                case 9:sMes = "El mes tiene 30 dias";
                break;
                case 10:sMes = "El mes tiene 31 dias";
                break;
                case 11:sMes = "El mes tiene 30 dias";
                break;
                case 12:sMes = "El mes tiene 31 dias";
                break;
                
                default:sMes = "Mes incorrecto";
    }

        
    }
    
}
