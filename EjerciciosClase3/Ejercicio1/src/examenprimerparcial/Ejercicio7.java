
package examenprimerparcial;

import java.util.Scanner;

/*Un empresa paga a sus vendedores de la siguiente manera:
Sueldo fijo $ 360.40 más un porcentaje de las ventas realizadas en el mes.
Si las ventas fueron menores o iguales a $ 500, el porcentaje es de 5%
Si las ventas fueron mayores a $ 500 y menores o iguales a $1000, el porcentaje es de 8%
Si las ventas fueron mayores a $ 1000 y menores o iguales a $5000, el porcentaje es de 10%
Si las ventas fueron mayores a $ 5000, el porcentaje es de 15%
Ingresar el valor de las ventas de un empleado y calcular su sueldo en base la información dada.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double ventas;
        double sueldot,total,porcent;
        double sueldofi=360.40;
        System.out.println("Ingrese el valor de las ventas");
        ventas=entrada.nextDouble();
        
        if(ventas<=500){
            total= (ventas*0.05);
            sueldot= (total+ sueldofi);
            System.out.println("El sueldo total del empleado es: " + sueldot );
            
        }else{
            if(ventas>500 && ventas<=1000){
                total= (ventas*0.08);
                sueldot = (total + sueldofi);
                
                System.out.println("El sueldo total del empleado es: " + sueldot );
            }else{
                if(ventas>1000 && ventas<=5000){
                    total= (ventas*0.10);
                    sueldot= (total + sueldofi);
                    System.out.println("El sueldo total del empleado es: " + sueldot );
                
                }else{
                    if(ventas>=5000){
                        total= (ventas*0.15);
                        sueldot = (total+sueldofi);
                        System.out.println("El sueldo total del empleado es: " + sueldot );
                    }
                }        
            }
        
        
        }
    
    
    }
}
