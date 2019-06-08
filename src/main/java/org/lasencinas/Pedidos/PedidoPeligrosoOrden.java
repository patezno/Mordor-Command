package org.lasencinas.Pedidos;

import org.lasencinas.Interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

    // Atributos

    private String destino = null;
    private String instrucciones = null;

    // Constructores

    public PedidoPeligrosoOrden() {}

    public PedidoPeligrosoOrden(String destino, String mensaje) {
        this.destino = destino;
        this.instrucciones = mensaje;
    }

    // Setters

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    // Getters

    public String getDestino() {
        return destino;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    @Override
    public String instrucciones() {
        return this.instrucciones;
    }

    @Override
    public int peso() {
        return 0;
    }

    @Override
    public String destino() {
        return this.destino;
    }
}
