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
public class Planta extends Pokemon{
    private Piedra tipoPiedra = Piedra.PLANTA;
    private String zonaCaptura = "";

    public Planta(String nombre, int ataque, Entrenador entrenador) {
        super(nombre, ataque, entrenador);
        this.zonaCaptura = "Norte";
    }

    public Piedra getTipoPiedra() {
        return tipoPiedra;
    }

    public void setTipoPiedra(Piedra tipoPiedra) {
        this.tipoPiedra = tipoPiedra;
    }

    public String getZonaCaptura() {
        return zonaCaptura;
    }

    public void setZonaCaptura(String zonaCaptura) {
        this.zonaCaptura = zonaCaptura;
    }

    
    
}
