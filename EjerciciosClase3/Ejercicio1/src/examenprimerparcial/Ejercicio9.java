
package examenprimerparcial;

import java.util.Scanner;

/*Dos triángulos son congruentes si tienen la misma forma y tamaño, es decir, su ángulos y  lados 
correspondientes son iguales. Elaborar un algoritmo que lea los tres ángulos y tres lados de dos 
triángulos e imprima si son congruentes, caso contrario que imprima que no son congruentes.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        double a1,a2,a3,b1,b2,b3,c1,c2,c3,l1,l2,l3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el angulo 1 del primer triangulo");
        a1=entrada.nextDouble();
        System.out.println("Ingresar el angulo 2 del primer triangulo");
        a2=entrada.nextDouble();
        System.out.println("Ingresar el angulo 3 del primer triangulo");
        a3=entrada.nextDouble();
        System.out.println("Ingresar el valor del lado 1 del primer triangulo");
        l1=entrada.nextDouble();
        System.out.println("Ingresar el valor del lado 2 del primer triangulo");
        l2=entrada.nextDouble();
        System.out.println("Ingresar el valor del lado 3 del primer triangulo");
        l3=entrada.nextDouble();
        
        System.out.println("Ingresar el angulo 1 del segundo triangulo");
        b1=entrada.nextDouble();
        System.out.println("Ingresar el angulo 2 del segundo triangulo");
        b2=entrada.nextDouble();
        System.out.println("Ingresar el angulo 3 del segundo triangulo");
        b3=entrada.nextDouble();
        System.out.println("Ingresar el valor del lado 1 del segundo triangulo");
        c1=entrada.nextDouble();
        System.out.println("Ingresar el valor del lado 2 del segundo triangulo");
        c2=entrada.nextDouble();
        System.out.println("Ingresar el valor del lado 3 del segundo triangulo");
        c3=entrada.nextDouble();
        
        
        if (((a1==b1)&&(a2==b2)&&(a3==b3))&&((l1==c1)&&(l2==c2)&&(l3==c3))){
            System.out.println("Los triangulos si son congruentes");

        }else{
            System.out.println("Los triangulos no son congruentes");

        }
        
        
        
    }
    
    
}
