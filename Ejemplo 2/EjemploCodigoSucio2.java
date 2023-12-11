/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancodeproject;
class c {
    double x;
    double y;
}
/**
 *
 * @author Vicente Mena
 */
public class EjemploCodigoSucio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        c P = new c();
        c Q = new c();
        c R = new c();
        c O = new c();
        P.x=1.1;
        P.y=2.2;
        Q.x=4.7;
        Q.y=7.4;
        R.x=0.5;
        R.y=3.5;
        O.x=0;
        O.y=0;
        double h = Math.sqrt((Math.pow(P.x, 2))+(Math.pow(P.y, 2)));
        double i = Math.sqrt((Math.pow(Q.x, 2))+(Math.pow(Q.y, 2)));
        double j = Math.sqrt((Math.pow(R.x, 2))+(Math.pow(R.y, 2)));
        System.out.printf("P (%1.1f:%1.1f) - O (%1.1f:%1.1f) = %1.3f\n", P.x , P.y , O.x , O.y , h);
        System.out.printf("Q (%1.1f:%1.1f) - O (%1.1f:%1.1f) = %1.3f\n", Q.x , Q.y , O.x , O.y , i);
        System.out.printf("R (%1.1f:%1.1f) - O (%1.1f:%1.1f) = %1.3f\n", R.x , R.y , O.x , O.y , j);
        double PQ = Math.sqrt((Math.pow((P.x-Q.x),2 ) + Math.pow((P.y-Q.y),2 )));
        System.out.printf("P: (%1.1f:%1.1f) - Q: (%1.1f:%1.1f) = %02.5f\n", P.x , P.y ,Q.x , Q.y , PQ);
        double PR = Math.sqrt((Math.pow((P.x-R.x),2 ) + Math.pow((P.y-R.y),2 )));
        System.out.printf("P: (%1.1f:%1.1f) - R: (%1.1f:%1.1f) = %02.5f\n", P.x , P.y ,R.x , R.y , PR);
        double RQ = Math.sqrt((Math.pow((R.x-Q.x),2 ) + Math.pow((R.y-Q.y),2 )));
        System.out.printf("P: (%1.1f:%1.1f) - Q: (%1.1f:%1.1f) = %02.5f\n", R.x , R.y ,Q.x , Q.y , RQ);
        
    }
    
}
