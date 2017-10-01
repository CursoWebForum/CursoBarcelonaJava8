/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursobarcelonajava8.chap6;

//Clase Collectors
// groupingBy() Devuelve un Colector implementando una operación en cascada "group by" en los 
//elementos de entrada del tipo T, agrupando los elementos según una función de 

import static cursobarcelonajava8.chap6.Dish.menu;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

//Clase Collectors
// groupingBy() Devuelve un Colector implementando una operación en cascada "group by" en los 
//elementos de entrada del tipo T, agrupando los elementos según una función de 
//clasificación, y luego realizando una operación de reducción en los valores 
//asociados a una clave dada utilizando el Colector especificado

public class Grouping {

    enum CaloricLevel { DIET, NORMAL, FAT };

    public static void main(String ... args) {
        //System.out.println("Dishes grouped by type: " + groupDishesByType());
        //System.out.println("Dish names grouped by type: " + groupDishNamesByType());
        //System.out.println("Dish tags grouped by type: " + groupDishTagsByType());
       // System.out.println("Caloric dishes grouped by type: " + groupCaloricDishesByType());
       // System.out.println("Dishes grouped by caloric level: " + groupDishesByCaloricLevel());
       // System.out.println("Dishes grouped by type and caloric level: " + groupDishedByTypeAndCaloricLevel());
       // System.out.println("Count dishes in groups: " + countDishesInGroups());
       // System.out.println("Most caloric dishes by type: " + mostCaloricDishesByType());
      //  System.out.println("Most caloric dishes by type: " + mostCaloricDishesByTypeWithoutOprionals());
       // System.out.println("Sum calories by type: " + sumCaloriesByType());
       // System.out.println("Caloric levels by type: " + caloricLevelsByType());
    }

    
    //Platos agrupados por tipo.................escribir......................
   
//Platos agrupados por el nombre y su tipo...............escribir.....................
    

    

    //Platos agrupados por calorias y tipo con filtro de predicado...escribir...
    
//Platos agrupados por nivel de calorias..................escribir.......................
    
//Agrupacion de agrupacion de calorias y nivel de calorias.....escribir.........
    
//Operaciones de conteo....
   
//reducing() es un metodo mas generico para reducir un stream a un valor...escribir
    
//sin Optional y con collectionAndThen
    

    
//Agrupacion por nivel de caloria con funcion mapping.....escribir..............
    
}