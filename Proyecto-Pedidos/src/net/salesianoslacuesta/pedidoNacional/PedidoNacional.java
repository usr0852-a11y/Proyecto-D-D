package net.salesianoslacuesta.pedidoNacional;
import net.salesianoslacuesta.pedido.Pedido;
import net.salesianoslacuesta.pedidoNacional.PedidoNacional;

public class PedidoNacional extends Pedido {
    private double peso;
    private boolean urgente;

    public PedidoNacional(String codigo, String cliente, double importeBase, double peso, boolean urgente) {
        super(codigo, cliente, importeBase);
        this.peso = peso;
        this.urgente = urgente;
    }
}

