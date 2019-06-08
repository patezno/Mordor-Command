package org.lasencinas.Pedidos;

import org.lasencinas.Interfaces.PedidoPeligroso;

import java.util.UUID;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

    // Atributos

    private String destino = null;
    private String instrucciones = null;
    private String id = null;

    // Constructores

    public PedidoPeligrosoOrden() {}

    public PedidoPeligrosoOrden(String destino, String mensaje) {
        this.destino = destino;
        this.instrucciones = mensaje;
        this.id = UUID.randomUUID().toString();
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

    public String getId() {
        return id;
    }
    // Métodos

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
