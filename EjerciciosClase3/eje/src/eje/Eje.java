
package eje;

import java.util.Scanner;

public class Eje {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 0;
        double estatura=0;
        double sumat = 0;
        double promedio_final = 0;
        boolean bandera = true;
        System.out.println("Ingrese la estatura del estudiante");
        Scanner entrada = new Scanner(System.in);
        estatura = entrada.nextDouble();
        if(estatura>=1.20){
            while (bandera){
                System.out.printf("Ingrese la estatura  %d\n", contador);
                estatura = entrada.nextInt();
                double estatura_real = (double)estatura;
                sumat = sumat + estatura_real;
                contador = contador + 1;
            
                entrada.nextLine(); 
                System.out.println("Ingrese si(salir)");
                String temporal = entrada.nextLine();
                if(temporal.equals("si")){
                   bandera = false;
                }
            }
            promedio_final = sumat/contador;
            System.out.printf("El promedio final es %.2f\n", promedio_final);
        }
            
    }   
}        
            
   
