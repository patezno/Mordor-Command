package org.lasencinas.Pedidos;

import org.lasencinas.Interfaces.PedidoPeligroso;
import org.lasencinas.Interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

    // Atributos

    private PedidoPeligroso pedidoPeligroso = null;

    // Constructores

    public TratamientoPedidoPeligroso() {}

    public TratamientoPedidoPeligroso(PedidoPeligroso pedidoConPeligro) {
        this.pedidoPeligroso = pedidoConPeligro;
    }

    // Setters

    public void setPedidoPeligroso(PedidoPeligroso pedidoPeligroso) {
        this.pedidoPeligroso = pedidoPeligroso;
    }

    // Getters

    public PedidoPeligroso getPedidoPeligroso() {
        return pedidoPeligroso;
    }

    @Override
    public boolean tratar() {
        return !pedidoPeligroso.instrucciones().equals("no ponerselo en el dedo");
    }
}
