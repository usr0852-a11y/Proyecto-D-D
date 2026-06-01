package net.salesianoslacuesta.personaje;

public class Personaje  {
   private String nombre;
    private int nivel;
    private int energia;

    private static int totalPersonajes;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
        totalPersonajes++;
    } 

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }


}
   

