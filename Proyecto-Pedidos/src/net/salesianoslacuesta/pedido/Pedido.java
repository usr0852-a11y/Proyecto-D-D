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

    public double calcularImporteFinal() {
    return importeBase;
    }

    public boolean esPedidoValido() {
       if (codigo == null || codigo.isEmpty()) {
        return false;
       } else if (cliente == null || cliente.isEmpty()) {
        return false;
       } else if (importeBase <= 0) return false;

       return true;
    }

    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje <= 0 || porcentaje >= 100) {
            return false;
        }

        importeBase -= importeBase * (porcentaje / 100);
        return true;
    }

    public String mostrarInfo() {
        return "Código: " + codigo + "Cliente: " + cliente + 
        "Importe base: " + importeBase + "Importe final: " + calcularImporteFinal();
    }

    public static String mostrarTotalPedidos() {
        return "Total de pedidos " + totalPedidos;
    }

}