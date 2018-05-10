
package examenprimerparcial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String uno = "A";
        String dos = "Z";
       
        
        if(uno.compareTo(dos)<0){
            System.out.printf("Primera letra es %s\n", uno);
            System.out.printf("Segunda letra es %s\n", dos);
        }else{
            System.out.printf("Primera letra es %s\n", dos);
            System.out.printf("Segunda letra es %s\n", uno);
        }
    }           
}

