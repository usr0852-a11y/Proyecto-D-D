package net.salesianoslacuesta.pedidoInternacional;

import net.salesianoslacuesta.pedidoInternacional.PedidoInternacional;
import net.salesianoslacuesta.pedido.Pedido;

public class PedidoInternacional extends Pedido {
    private String paisDestino;
    private boolean aduanas;

    public PedidoInternacional(String codigo, String cliente, double importeBase, String paisDestino, boolean aduanas) {
        super(codigo, cliente, importeBase);
        this.paisDestino = paisDestino;
        this.aduanas = aduanas;
    }

    // AUN FALTA CREAR GETTERS Y SETTERS Y HACER COMMIT

    // Getters

    public String getPaisDestino() {
        return paisDestino;
    }

    public boolean getAduanas() {
        return aduanas;
    }

    //Setters

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public void setAduanas(boolean aduanas) {
        this.aduanas = aduanas;
    }

    @Override
    public double calcularImporteFinal() {
        double total = getImporteBase();

        total += 25;

        if (aduanas = true) {
            total += getImporteBase() * 0.12;
        }

        if(paisDestino.equals("Suiza") || paisDestino.equals("Noruega") ) {
            total += 18;
        }

        if (getImporteBase() > 200) {
            total -= 10;
        }
        return total;

    }
    
    public boolean requiereRevisionAduanera() {
        if (aduanas) {
            return true;
        }

        if (!(paisDestino.equals("Francia") || paisDestino.equals("Portugal") || paisDestino.equals("Italia"))) {
            return true;
        }
        return false;
    }
}