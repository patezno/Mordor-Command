package org.lasencinas.Pedidos;

import org.lasencinas.Interfaces.Pedido;

public class PedidoInternacional implements Pedido {

    // Atributos
    private String destino = null;
    private int peso = 0;

    // Constructores

    public PedidoInternacional() {
    }

    public PedidoInternacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    // Setters

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    // Getters

    public String getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }

    // Métodos

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String destino() {
        return this.destino;
    }
}
