/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclase;

import java.util.Objects;

/**
 *
 * @author educacionit
 */
public class Variables {
    String dni;
    
    String a = "hola";
    String b = "hola";
    
       @Override
    public boolean equals(Object obj) {
        Persona p=(Persona)obj;
        return this.dni.equals(p.dni);
    }


}
