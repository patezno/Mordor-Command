package org.lasencinas.Procesador;

import org.lasencinas.Interfaces.Procesador;
import org.lasencinas.Interfaces.TratamientoPedido;

public class Oficina implements Procesador {
    @Override
    public boolean procesa(TratamientoPedido pedido) {
        return pedido.tratar();
    }
}
