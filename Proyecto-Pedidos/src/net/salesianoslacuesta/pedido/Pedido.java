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

    // Getters

    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }
    public double getImporteBase() {
        return importeBase;
    }

    // Setters

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setImporteBase(double importeBase) {
        this.importeBase = importeBase;
    }

}