package net.salesianoslacuesta.mago;
import net.salesianoslacuesta.mago.Mago;
import net.salesianoslacuesta.personaje.Personaje;

public class Mago extends Personaje {
    private String elemento;

    public Mago(String nombre, int nivel, String elemento) {
        super(nombre, nivel);
        this.elemento = elemento;
    }

    // Getter
    public String getElemento() {
        return elemento;
    }
    // Setter
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nivel: " + getNivel());
        System.out.println("Elemento: " + elemento);
    }

    public void ataqueElemental() {
        gastarEnergia(25);
    }




}
