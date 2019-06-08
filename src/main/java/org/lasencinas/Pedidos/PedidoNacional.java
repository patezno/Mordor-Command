package org.lasencinas.Pedidos;

import org.lasencinas.Interfaces.Pedido;

import java.util.UUID;

public class PedidoNacional implements Pedido {

    // Atributos

    private String destino = null;
    private int peso = 0;
    private String id = null;

    // Constructores

    public PedidoNacional() {}

    public PedidoNacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
        this.id = UUID.randomUUID().toString();
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

    public String getId() {
        return id;
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
