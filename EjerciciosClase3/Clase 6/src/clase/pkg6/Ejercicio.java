
package clase.pkg6;

import java.util.Scanner;


public class Ejercicio {
    public static void main(String[] args) {
        int edad=0, suma=0, contador=1;
        String cadenafinal ="";
        
        //System.out.printf("%s \t %s \n","EDAD", "SUMA");
        cadenafinal= String.format("%s \t %s", "EDAD", "SUMA", "\n");
        
        while(contador<=5){
            System.out.print("Ingrese la edad :\n");
            Scanner leer =new Scanner(System.in);
            edad = leer.nextInt();
            
            suma = suma + edad;
            cadenafinal=String.format("%s %d \t %d \n",cadenafinal,edad,suma);
            contador=contador+1;
        }
        System.out.printf("%s \n ",cadenafinal);
        
      
    }    
}
