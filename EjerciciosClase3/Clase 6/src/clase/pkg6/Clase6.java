
package clase.pkg6;

public class Clase6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        int contador = 1;
        System.out.printf("%s \t %s", "CONTADOR", "SUMA");
        System.out.printf("\n"); 
        
        while (contador<=4){
            suma = suma +contador;
            System.out.printf("%d \t \t %d \n",contador, suma);
            contador = contador + 1;
        }
    }
    
}
