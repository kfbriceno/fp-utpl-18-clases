/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprimerparcial;

import java.util.Scanner;

/*Realizar un programa en Java que permita ingresar por teclado la longitud y la anchura de una 
habitación, realizar los procesos respectivos que permita obtener la superficie de la misma, además 
se debe presentar en pantalla el valor de la superficie, finalmente tomar en consideración que se 
debe presentar el valor con 3 decimales
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);

        double longitud, anchura;
        double superficie;
        
        System.out.println("Ingrese la longitud de la habitacion");
        longitud = entrada.nextDouble();
        
        System.out.println("Ingrese la anchura de la habitacion");
        anchura = entrada.nextDouble();
        
        
        superficie = (longitud * anchura);
        
        System.out.println("La anchura de la habitacion es " + superficie);
        
    }
    
}
