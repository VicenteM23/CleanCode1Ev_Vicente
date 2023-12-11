/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancodeproject;

import java.util.Scanner;

/**
 *
 * @author Vicente Mena
 */
public class EjemploCodigoSucio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String i;
            System.out.print("Inserta el número de aciertos en 20 preguntas :" );
            i = scan.nextLine();
            double j = Double.valueOf(i);
            double f = 20-j;
            System.out.println("Número de errores: " + f);
            double h = f / 2;
            System.out.println(h);
            double k = (f - h)/2;
            if(k < 5)
                System.out.println("Calificación: " + k + " Insuficiente");
            else if(k >= 5 && k <6)
                System.out.println("Calificación: " + k + " Suficiente");
            else if(k >= 6 && k <7)
                System.out.println("Calificación: " + k + " Bien");
            else if(k >= 7 && k <9)
                System.out.println("Calificación: " + k + " Notable");
            else if(k >= 9)
                System.out.println("Calificación: " + k + " Sobresaliente");
    }
    
}
