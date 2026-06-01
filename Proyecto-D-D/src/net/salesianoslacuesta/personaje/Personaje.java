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
    public void entrenar(int x) {
        if(x <= 0) {
            System.out.println("No se puede entrenar 0 o menos niveles.");
        
        } else {
            nivel += x;
        }
    }

    public void descansar(int x) {
        if(x <= 0) {
            System.out.println("No se puede aumentar 0 o menos energia");
        } else if (energia + x > 100){
        System.out.println("La energia no puede superar los 100");
        energia = 100;
        } else {
            energia += x;
        }
    }

    public void gastarEnergia(int x) {
        energia -= x;
        if (energia < 0 ) {
            energia = 0;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Energia: " + energia);

    }

    public static void mostrarTotalPersonajes() {
        System.out.println("Total de personajes: " + totalPersonajes);
    }



}
   

