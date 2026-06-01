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
        
    }
}
