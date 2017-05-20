/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author educacionit
 */
public class Colecciones {

    /*una colección es una suseción de elementos subdividida en 3 partes:
    Listas<t>: conjunto de elementos ordenados por índice numérico. Similar a un array
    Sets<t>: no hay elementos repetidos (equals, hashcode)
            *Sonted Set: Ordenados
            
Queue<t>: Colas en java.  para metodos push pop.. etc
Colecciones tipadas

por otro lado...
MAP: Cada vez que guardo un elemento lo guardo indexado. metodos put (k,v) y get(k) no puedo tener
duplicadas las claves (equals - hashcode bien implementados)
K  V
k1 e1
k2 e2
k3 e3
    *Sonted Map: Orden.

    
    DISTRIBUIR UNA APP EN NETBEANS
    1* clean and build
    2* buscar la ubicación en manifest main-class:
    3* c:> java -jar project.jar
    
    DISTRIBUIR MAS PROFESIONALMENTE
    build system apache mavem (googlear)
    
 

( libro HEARD FIRST )
    
    
     */
//izq interfaz = der arraylis
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(); //LinkedList<>() es lista enlazada.

        nombres.add("juan");
        nombres.add("Pedro");
        nombres.add("Michelle");
        System.out.println("tamaño:" + nombres.size());
        System.out.println(nombres.get(0));
        nombres.remove(0);

        //var temporal- colección
        for (String e : nombres) { //cuando son dos secciones son :
            System.out.println(e);
        }
        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona("Juan", "10"));
        personas.add(new Persona("Pablo", "412410"));
        personas.add(new Persona("Pablo", "412410"));
        System.out.println("Tamaño:"+personas.size());
        for (Persona e : personas) { //cuando son dos secciones son :
            System.out.println(e);
        }
            
    SortedSet<String> ordenados = new TreeSet<>();
    ordenados.add("a");
    ordenados.add("b");
    ordenados.add("c");
for(String l : ordenados){
    System.out.println(l);}
    }//sout+ctrl+barra

}
