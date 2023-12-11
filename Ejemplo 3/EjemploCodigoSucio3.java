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
public class EjemploCodigoSucio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int J = 5;
        String i;
        int k = (int)(Math.random()*101);
        int n, m = 0;
        System.out.println("Esto es un juego en el que tienes que adivinar qué numero del 0 al 100 estoy pensando, para ello tienes 5 oportunidades.");
        do{
        System.out.printf("%s, Intentos: [%02d] : ","Por favor, introduzca un número del 0 al 100", m);
        i = scan.nextLine();
        n = Integer.valueOf(i);
        System.out.println("El número introducido es : " + n);
        m++;
        }while( n != k && m <= J );
        if( n == k ){
        System.out.println("¡Felicidades! Has adivinado el número");
        }else{
        System.out.println("Lo siento, te has quedado sin intentos, el número era : " + k);
        }
    }
    
}
