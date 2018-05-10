
package examenprimerparcial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {
    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);

        double calificacion1; 
        double calificacion2; 
        double calificacion3; 
        double calificacion4;
        double suma;
        double promedio;

      
        System.out.println("Ingresar la primera calificación");
        calificacion1 = entrada.nextDouble(); 
        
        System.out.println("Ingresar la segunda calificación");
        calificacion2 = entrada.nextDouble(); 
        
        System.out.println("Ingresar la tercera calificación");
        calificacion3 = entrada.nextDouble();  
        
        System.out.println("Ingresar la cuarta calificación");
        calificacion4 = entrada.nextDouble();  
        
            
        suma = calificacion1 + calificacion2 + calificacion3 + calificacion4;        
        promedio = suma / 4;
        
        if (promedio >= 90 && promedio <=100) {
            System.out.printf("El estudiante con promedio de calificaciones " + promedio + " esta en la puntuacion A "  );
        } else {
            if (promedio <=89 && promedio >= 80) {
                System.out.printf("El estudiante con promedio de calificaciones " + promedio + " esta en la puntuacion B "  );
            } else {
                if (promedio <= 79 && promedio >= 70) {
                    System.out.printf("El estudiante con promedio de calificaciones " + promedio + " esta en la puntuacion C "  );

                } else {
                    if (promedio <= 69 && promedio >= 0) {
                    System.out.printf("El estudiante con promedio de calificaciones " + promedio + " esta en la puntuacion D "  );
                    
                    }
                }
            }
        }
    }
}


    
    

