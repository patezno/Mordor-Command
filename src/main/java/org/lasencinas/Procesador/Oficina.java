package org.lasencinas.Procesador;

import org.lasencinas.Interfaces.Pedido;
import org.lasencinas.Interfaces.Procesador;
import org.lasencinas.Interfaces.TratamientoPedido;
import org.lasencinas.Pedidos.PedidoInternacional;
import org.lasencinas.Pedidos.PedidoPeligrosoOrden;

public class Oficina implements Procesador {

    // Constructores

    public Oficina() {
    }

    // Métodos

    @Override
    public boolean procesa(TratamientoPedido pedido) {
        return pedido.tratar();
    }

    public String printarStatus(boolean isProcessed, Pedido pedidoInternacional) {
        if (isProcessed) {
            return pedidoInternacional.destino() + " " + Status.ACEPTADO.name();
        }
        return pedidoInternacional.destino() + " " + Status.RECHAZADO.name();
    }
}
