
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

//Patron factory y Lambdas

public class FactoryMain {

    public static void main(String[] args) {
        //< 1.8
        Product p1 = ProductFactory.createProduct("loan");
        // Java 8...escribir..................................................
    
    }//main
//Clase Factory. Se encarga de instanciar diferentes tipos de productos
    static private class ProductFactory {
        public static Product createProduct(String name){
            switch(name){
                case "loan": return new Loan();
                case "stock": return new Stock();
                case "bond": return new Bond();
                default: throw new RuntimeException("No such product " + name);
            }
        }
//Metodo que retorna el nombre, Notar el uso de lambdas y funciones..escribir.
        
    }//fin clase ProductFactory

    static private interface Product {}
    static private class Loan implements Product {}
    static private class Stock implements Product {}
    static private class Bond implements Product {}

    //Mapa que hace las veces de suministrado de Productos
    final static private Map<String, Supplier<Product>> map = new HashMap<>();
    static {
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
        map.put("bond", Bond::new);
    }
}
