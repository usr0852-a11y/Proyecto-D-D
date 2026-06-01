package net.salesianoslacuesta.guerrero;

import net.salesianoslacuesta.personaje.Personaje;
import net.salesianoslacuesta.guerrero.Guerrero;

public class Guerrero extends Personaje {
   private String arma;

    public Guerrero(String nombre, int nivel, String arma) {
    super(nombre, nivel);
    this.arma = arma;
}

// Getters
    public String getArma() {
        return arma;
    }

// Setters
    public void setArma(String arma) {
    this.arma = arma;
    }



 
}
