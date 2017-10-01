//Patron observer con lambdas 
//Supuesto. Varias agencias de noticias se subscriben a un Fedd

import java.util.ArrayList;
import java.util.List;


public class ObserverMain {

    public static void main(String[] args) {
        //Creamos un nuevo Fed
      //  Feed f = new Feed();
        //registramos los observadores
      //  f.registerObserver(new NYTimes());
       // f.registerObserver(new Guardian());
       // f.registerObserver(new LeMonde());
       // f.notifyObservers("The queen said her favourite book is Java 8 in Action!");

 //Con lambdas registramos los observer...............esccribir................
 
//Nos permite parametrizar el comportamiento, la lambda hace referencia a la 
//firma de la interfaz Observe....................escribir...................
      
//recorremos la lista y vamos notificando escribir..............................
     

    }

//Primero necesitamos crear la interfaz donde las agencias se subscribiran..escr
    //Primero diseñamos la interfaz sujeto...escribir..............................
    
//Diferentes observadores que se subcriben  nuestro Feed y que tienen distintos
    //comportamientos
    /*static private class NYTimes implements Observer{
        @Override
        public void inform(String tweet) {
            if(tweet != null && tweet.contains("money")){
                System.out.println("Breaking news in NY!" + tweet);
            }
        }
    }*/
//Diferentes observadores que se subcriben  nuestro Feed y que tienen distintos
    //comportamientos e implementan Observer (comentados)
   /* static private class Guardian implements Observer{
        @Override
        public void inform(String tweet) {
            if(tweet != null && tweet.contains("queen")){
                System.out.println("Yet another news in London... " + tweet);
            }
        }
    }*/
//Diferentes observadores que se subcriben  nuestro Feed y que tienen distintos
    //comportamientos
 /*   static private class LeMonde implements Observer{
        @Override
        public void inform(String tweet) {
            if(tweet != null && tweet.contains("wine")){
                System.out.println("Today cheese, wine and news! " + tweet);
            }
        }
    }*/

    //Clase Feed escribir----------------------------------------------------
    

}
