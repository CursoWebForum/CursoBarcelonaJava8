
package cursobarcelonajava8.chap2;


import java.util.*;
//Temas tratados : 
//La adaptación a requisitos cambiantes y la parametrizacion del comportamiento.
// Introducción al Patron Strategy: Define una familia de algoritmos y los encapsula
//Predicados-> Funciones que devuelve verdadero o falso & Patron Strategy
//Con las expresiones Lambda reduciremos todavia mas el código. 

public class FilteringApples {

    public static void main(String... args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, "green"), 
                new Apple(155, "green"),
                new Apple(120, "red"));
//Podriamos llamar a nuestros metodos sin parametrizar el 
// comportamiento de esta manera:....
        List<Apple> greenApples = filterApplesByColor(inventory, "green");
        System.out.println(greenApples);
        List<Apple> redApples = filterApplesByColor(inventory, "red");
        System.out.println(redApples);

/*............................................................................*/

        


//Con Java 8 y patron Strategy-----ESCRIBIR-------------------------------------		
        
    }//Fin main()

//FILTROS SIN PARAMETRIZACION DEL COMPORTAMIENTO-------------------------------
    //Esto sería malo para el rendimiento, no respeta el principio DRY..
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result; 
    }
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }
//------------------------------PATRON STRATEGY---------------------------------


    public static class Apple {

        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Apple{"
                    + "color='" + color + '\''
                    + ", weight=" + weight
                    + '}';
        }
    }
// 1º Esta interfaz devuelve un booleano (true-false)
//que nos permitira hacer distintas implementaciones para representar diferentes 
//criterios de seleccion, necesitaremos tambien el metodo filter();

   

//Necesitamos un metodo Filter que acepte objetos ApplePredicate para elegir en
// tiemp de ejecucion la implementación de la interfaz ApplePredicate, 
//además hemos separado la logica de iteracion del comportamiento  o de que deseamos que haga el 
// metodo...)
 

//Patron de diseño strategy, donde implementamos los distintos criterios de
// filtro y que permite seleccionar un metodo en TIEMPO DE EJECUCION en funcion
//de unos criterios
    
}