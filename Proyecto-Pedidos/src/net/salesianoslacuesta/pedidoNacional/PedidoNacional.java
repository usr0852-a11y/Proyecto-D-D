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

    // Getters

    public double getPeso() {
        return peso;
    }

    public boolean getUrgente() {
        return urgente;
    }

    // Setters

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    @Override
    public double calcularImporteFinal() {
        double importe = super.calcularImporteFinal();

        if (peso <= 2) {
            importe +=5;
        } else if(peso >= 2 && peso <= 10) {
            importe +=12;
        } else {
            importe +=20;
        }

        // Coste por ser urgente
        if(urgente) {
            importe +=15;
        }
        return importe;
    }

    public void cambiarUrgencia() {
        if (urgente) {
            urgente = false;
        } else {
            urgente = true;
        }
    }

    @Override
    public String mostrarInfo() {
        
        String textoUrgente;
        if (urgente) {
            textoUrgente = "Si";
        } else {
            textoUrgente = "No";
        }
        
        return "Código: " + getCodigo() + " Peso: " + peso + " kg" + " Urgente: " + textoUrgente + " Importe final: " + calcularImporteFinal() + " €";
         
    }
}

