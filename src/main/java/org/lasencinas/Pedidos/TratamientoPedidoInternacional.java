package org.lasencinas.Pedidos;

import org.lasencinas.Interfaces.TratamientoPedido;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    // Atributos

    private PedidoInternacional pedido = null;

    // Constructores

    public TratamientoPedidoInternacional() {
    }

    public TratamientoPedidoInternacional(PedidoInternacional pedido) {
        this.pedido = pedido;
    }

    // Setters

    public void setPedido(PedidoInternacional pedido) {
        this.pedido = pedido;
    }

    // Getters

    public PedidoInternacional getPedido() {
        return pedido;
    }

    // Métodos

    @Override
    public boolean tratar() {
        return !pedido.destino().equals("Mordor");
    }
}
