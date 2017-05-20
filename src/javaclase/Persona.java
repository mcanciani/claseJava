/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclase;

/**
 *
 * @author educacionit
 */

import java.util.Date;

public abstract class Persona {
    
private String Nombre;
private java.util.Date nac;
int dni;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


}