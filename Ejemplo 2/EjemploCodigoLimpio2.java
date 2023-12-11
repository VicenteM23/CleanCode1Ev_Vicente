/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancodeproject;
class Coordenadas {
    double x;
    double y;
}
/**
 *
 * @author user
 */
public class EjemploCodigoLimpio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coordenadas PuntoP = new Coordenadas();
        Coordenadas PuntoQ = new Coordenadas();
        Coordenadas PuntoR = new Coordenadas();
        Coordenadas PuntoO = new Coordenadas();
        
        
        PuntoP.x=1.1;
        PuntoP.y=2.2;
        
        PuntoQ.x=4.7;
        PuntoQ.y=7.4;
        
        PuntoR.x=0.5;
        PuntoR.y=3.5;
        
        PuntoO.x=0;
        PuntoO.y=0;
        
        //Operaciones para calcular la distancia entre puntos y origen:
        double distanciaPOrigen = Math.sqrt((Math.pow(PuntoP.x, 2))+(Math.pow(PuntoP.y, 2)));
        double distanciaQOrigen = Math.sqrt((Math.pow(PuntoQ.x, 2))+(Math.pow(PuntoQ.y, 2)));
        double distanciaROrigen = Math.sqrt((Math.pow(PuntoR.x, 2))+(Math.pow(PuntoR.y, 2)));
        
        
        System.out.printf("Distancia desde PuntoP (%1.1f:%1.1f) al Punto de Origen (%1.1f:%1.1f) = %1.3f\n", PuntoP.x , PuntoP.y , PuntoO.x , PuntoO.y , distanciaPOrigen);
        System.out.printf("Distancia desde PuntoQ (%1.1f:%1.1f) al Punto de Origen (%1.1f:%1.1f) = %1.3f\n", PuntoQ.x , PuntoQ.y , PuntoO.x , PuntoO.y , distanciaQOrigen);
        System.out.printf("Distancia desde PuntoR (%1.1f:%1.1f) al Punto de Origen (%1.1f:%1.1f) = %1.3f\n", PuntoR.x , PuntoR.y , PuntoO.x , PuntoO.y , distanciaROrigen);
        
        //Operación para calcular la distancia entre los puntos P y Q:
        double resultadoPQ = Math.sqrt((Math.pow((PuntoP.x-PuntoQ.x),2 ) + Math.pow((PuntoP.y-PuntoQ.y),2 )));
        System.out.printf("La distancia entre PuntoP: (%1.1f:%1.1f)y PuntoQ: (%1.1f:%1.1f) es : %02.5f\n", PuntoP.x , PuntoP.y ,PuntoQ.x , PuntoQ.y , resultadoPQ);
        
        //Operación para calcular la distancia entre los puntos P y R:
        double resultadoPR = Math.sqrt((Math.pow((PuntoP.x-PuntoR.x),2 ) + Math.pow((PuntoP.y-PuntoR.y),2 )));
        System.out.printf("La distancia entre PuntoP: (%1.1f:%1.1f)y PuntoR: (%1.1f:%1.1f) es : %02.5f\n", PuntoP.x , PuntoP.y ,PuntoR.x , PuntoR.y , resultadoPR);
        
        //Operación para calcular la distancia entre los puntos R y Q:
        double resultadoRQ = Math.sqrt((Math.pow((PuntoR.x-PuntoQ.x),2 ) + Math.pow((PuntoR.y-PuntoQ.y),2 )));
        System.out.printf("La distancia entre PuntoP: (%1.1f:%1.1f)y PuntoQ: (%1.1f:%1.1f) es : %02.5f\n", PuntoR.x , PuntoR.y ,PuntoQ.x , PuntoQ.y , resultadoRQ);
        
    }
    
}
