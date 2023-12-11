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
public class EjemploCodigoLimpio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String numeroAciertos;
            System.out.print("Inserta el número de aciertos en 20 preguntas :" );
            numeroAciertos = scan.nextLine();
            double numAciertosDouble = Double.valueOf(numeroAciertos);
            
            double numeroErrores = 20-numAciertosDouble; //Operación que calcula el número de errores
            System.out.println("Número de errores: " + numeroErrores);
            
            double notaResta = numeroErrores / 2; //Operación que calcula la nota que restará a la final
            System.out.println(notaResta);
            
            double notaFinal = (numAciertosDouble - notaResta)/2; //Operación para calcular la nota final
            
            if(notaFinal < 5)
                System.out.println("Calificación: " + notaFinal + " Insuficiente");
            
            else if(notaFinal >= 5 && notaFinal <6)
                System.out.println("Calificación: " + notaFinal + " Suficiente");
            
            else if(notaFinal >= 6 && notaFinal <7)
                System.out.println("Calificación: " + notaFinal + " Bien");
            
            else if(notaFinal >= 7 && notaFinal <9)
                System.out.println("Calificación: " + notaFinal + " Notable");
            
            else if(notaFinal >= 9)
                System.out.println("Calificación: " + notaFinal + " Sobresaliente");
    }
    
}
