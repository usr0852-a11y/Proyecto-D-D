import net.salesianoslacuesta.pedido.Pedido;
import net.salesianoslacuesta.pedidoInternacional.PedidoInternacional;
import net.salesianoslacuesta.pedidoNacional.PedidoNacional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pedido pedidoBase = new Pedido("P001", "Lucia", 80);

        System.out.println(pedidoBase.mostrarInfo());
        System.out.println("¿El pedido es válido?: " + pedidoBase.esPedidoValido());
        pedidoBase.aplicarDescuento(10);
        
        System.out.println(pedidoBase.mostrarInfo());

        System.out.println(Pedido.mostrarTotalPedidos());

        PedidoNacional pedidoRapido = new PedidoNacional("P002", "Mario", 120, 6.5, true);
        System.out.println(pedidoRapido.mostrarInfo());

        pedidoRapido.cambiarUrgencia();
        System.out.println(pedidoRapido.mostrarInfo());

        System.out.println("¿El pedido es válido?: " + pedidoRapido.esPedidoValido());

        System.out.println(Pedido.mostrarTotalPedidos());

        PedidoInternacional pedidoExterior = new PedidoInternacional("P003", "Sara", 250, "Suiza", true);

        System.out.println(pedidoExterior.mostrarInfo());

        System.out.println("¿Requiere revisión aduanera?: " + pedidoExterior.requiereRevisionAduanera());

        pedidoExterior.aplicarDescuento(5);

        System.out.println(pedidoExterior.mostrarInfo());

        System.out.println(Pedido.mostrarTotalPedidos());

        // Introducir los 3 pedidos en el array

        Pedido[] tiendaOnline = new Pedido[3];
        tiendaOnline[0] = pedidoBase;
        tiendaOnline[1] = pedidoRapido;
        tiendaOnline[2] = pedidoExterior;

        System.out.println("Información de los pedidos: ");

         for (int i = 0; i < tiendaOnline.length; i++) {
            System.out.println(tiendaOnline[i].mostrarInfo());
        }

        double importeTotal = 0;
        int pedidosValidos = 0;
        Pedido pedidoMayor = tiendaOnline[0];

        for (int i = 0; i < tiendaOnline.length; i++) {
            double importeFinal = tiendaOnline[i].calcularImporteFinal();

            importeTotal += importeFinal;

            if (tiendaOnline[i].esPedidoValido()) {
                pedidosValidos++;
            }

            if (importeFinal > pedidoMayor.calcularImporteFinal()) {
                pedidoMayor = tiendaOnline[i];
            }
        }

        System.out.println("Importe total de todos los pedidos: " + importeTotal);
        System.out.println("Número de pedidos válidos: " + pedidosValidos);
        System.out.println("Codigo del pedido con mayor importe: " + pedidoMayor.getCodigo());
        System.out.println("Importe final del pedido mayor: " + pedidoMayor.calcularImporteFinal());

        scanner.close();
    }
    
}
