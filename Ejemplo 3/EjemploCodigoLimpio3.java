/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancodeproject;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author user
 */
public class EjemploCodigoLimpio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int Oportunidades = 5;
        String introducidoString;
        int aleatorio = (int)(Math.random()*101); //Operación para calcular numero aleatorio del 0 al 100
        int introducidoInt, intentos = 0;
        System.out.println("Esto es un juego en el que tienes que adivinar qué numero del 0 al 100 estoy pensando, para ello tienes 5 oportunidades.");
          //Función para verificar si el número introducido corresponde con el generado
            do{
                System.out.printf("%s, Intentos: [%02d] : ","Por favor, introduzca un número del 0 al 100", intentos);
                introducidoString = scan.nextLine();
                introducidoInt = Integer.valueOf(introducidoString);
                System.out.println("El número introducido es : " + introducidoInt);
                intentos++;
            }while( introducidoInt != aleatorio && intentos <= Oportunidades );
            
          
            if( introducidoInt == aleatorio ){
                System.out.println("¡Felicidades! Has adivinado el número");
            }else{
                System.out.println("Lo siento, te has quedado sin intentos, el número era : " + aleatorio);
            }
    }
    
}
