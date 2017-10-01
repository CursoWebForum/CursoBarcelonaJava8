
package cursobarcelonajava8.chap5;

import java.util.Arrays;
import static java.util.Comparator.comparing;
import java.util.List;
import static java.util.stream.Collectors.toList;
// Revisar conclusiones pag 158 Java in Action

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Pregunta 1: Encuentre todas las transacciones del año 2011 y ordénelas por valor (menor a mayor).
        
        
        // Pregunta 2: ¿Cuáles son todas las ciudades únicas donde trabajan los comerciantes?
        

        // Pregunta 3: Encuentre a todos los comerciantes de Cambridge y ordénelos por nombre.
        
        
        
        
        // Pregunta 4: Devuelve una cadena de nombres de todos los operadores ordenados alfabéticamente.
        
        
        // Pregunta 5: ¿Hay algún comerciante con sede en Milán?
        
        
        
        
        // Pregunta 6: Actualizar todas las transacciones para que los operadores de Milán estén en Cambridge.
       
        
        // pregunta 7:¿Busca el valor más alto en todas las transacciones? 7: 
        
    }
    
    
}
