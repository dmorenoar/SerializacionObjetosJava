/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author dmorenoar
 */
public class Agua extends Pokemon{
    private Piedra tipoPiedra = Piedra.AGUA;

    public Agua(String nombre, int ataque, Entrenador entrenador) {
        super(nombre, ataque, entrenador);
    }

    public Piedra getTipoPiedra() {
        return tipoPiedra;
    }

    public void setTipoPiedra(Piedra tipoPiedra) {
        this.tipoPiedra = tipoPiedra;
    }
    
    
    
}
