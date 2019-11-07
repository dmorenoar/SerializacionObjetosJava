/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.Serializable;

/**
 *
 * @author dmorenoar
 */
public class Pokemon implements Serializable{
    private String nombre;
    private int ataque;
    private  Entrenador entrenador;
    private transient String poder;

    public Pokemon(String nombre, int ataque, Entrenador entrenador) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    
    
    
    
}
