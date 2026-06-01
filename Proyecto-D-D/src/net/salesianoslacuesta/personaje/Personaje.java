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
}
   

