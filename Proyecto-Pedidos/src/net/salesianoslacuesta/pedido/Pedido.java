package net.salesianoslacuesta.pedido;

public class Pedido {
    private String codigo;
    private String cliente;
    private double importeBase;

    private static int totalPedidos = 0;

    public Pedido(String codigo, String cliente, double importeBase) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.importeBase = importeBase;
        totalPedidos++;
    }
}