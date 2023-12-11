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
        //Realizamos el proceso para solicitar al usuario que nos indique cuantos aciertos ha obtenido en su examen:
            String numeroAciertos;
            System.out.print("Inserta el número de aciertos en 20 preguntas :" );
            numeroAciertos = scan.nextLine();
            double numAciertosDouble = Double.valueOf(numeroAciertos); /*Necesitamos realizar el cambio de tipo, 
            ya que, hemos solicitado un String y nosotros vamos a trabajar con double*/
            
        /*Creamos y visualizamos por pantalla la variable que contiene el número de errores 
        que el usuario ha obtenido:*/
            double numeroErrores = 20-numAciertosDouble;
            System.out.println("Número de errores: " + numeroErrores);
            
        /*Debido a que cada error resta 0.5 a la nota, es necesario dividir sus errores entre 2 
        para obtener cuanta nota total se le restará, dicho valor lo almacenamos en otra variable:*/
            double notaResta = numeroErrores / 2;
            System.out.println(notaResta);
            
        /*Creamos nuestra última variable, que nos servirá para realizar nuestro condicional if, 
        este le mostrará al usuario su nota numérica además de indicarle si esta es Insuficiente, 
        Suficiente, Bien, Notable o Sobresaliente*/
            double notaFinal = (numAciertosDouble - notaResta)/2;
            
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
