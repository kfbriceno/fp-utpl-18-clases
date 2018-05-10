
package ejercciostarea;

import java.util.Scanner;


public class EjercciosTarea {

   
    public static int main(String[] args) {
        // TODO code application logic here
        int dia;

    System.out.printf( "\n   Introduzca d%ca de la semana: ", 161 );
    Scanner leer =new Scanner(System.in);
    dia = leer.nextInt();
    //scanf( "%d", &dia );

    switch ( dia )
    {
         case 1 : System.out.printf( "\n   Lunes" );
                  break;
         case 2 : System.out.printf( "\n   Martes" );
                  break;
         case 3 : System.out.printf( "\n   Mi%crcoles", 130 );
                  break;
         case 4 : System.out.printf( "\n   Jueves" );
                  break;
         case 5 : System.out.printf( "\n   Viernes" );
                  break;
         case 6 : System.out.printf( "\n   S%cbado", 160 );
                  break;
         case 7 : System.out.printf( "\n   Domingo" );
                  break;
        default : System.out.printf( "\n   ERROR: D%ca incorrecto.", 161 );
    }

    getch(); /* Pausa */

    return 0;
    }
    
}
