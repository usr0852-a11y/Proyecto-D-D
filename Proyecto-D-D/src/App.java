import net.salesianoslacuesta.guerrero.Guerrero;
import net.salesianoslacuesta.mago.Mago;
import net.salesianoslacuesta.personaje.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
         Personaje viajero = new Personaje("Eldrin", 3);

        viajero.entrenar(4);
        viajero.gastarEnergia(30);
        viajero.mostrarInfo();

        Personaje.mostrarTotalPersonajes();

        System.out.println("-----------------------"); //separar personajes q se vea bien en consola

        Guerrero guerrero1 = new Guerrero("Thorak", 5, "Hacha doble");
        guerrero1.ataquePesado();
        guerrero1.descansar(10);
        guerrero1.mostrarInfo();
        Personaje.mostrarTotalPersonajes();

        System.out.println("-----------------------"); 

        Mago mago1 = new Mago("Lyra", 4, "Hielo");

        mago1.ataqueElemental();
        mago1.entrenar(2);
        mago1.mostrarInfo();
        Personaje.mostrarTotalPersonajes();


    }
}
