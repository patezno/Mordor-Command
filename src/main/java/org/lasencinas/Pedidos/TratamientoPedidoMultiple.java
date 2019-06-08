package org.lasencinas.Pedidos;

import org.lasencinas.Interfaces.Pedido;
import org.lasencinas.Interfaces.TratamientoPedido;

import java.util.HashSet;
import java.util.Set;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    // Atributos

    private Set<Pedido> pedidos = null;
    private double numBultos = 0;
    private double pesoTotal = 0;

    // Constructores

    public TratamientoPedidoMultiple() {}

    public TratamientoPedidoMultiple(Set pedidos) {
        this.pedidos = pedidos;
    }

    // Setters

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    // Getters

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    // Métodos

    public void calcularTotalBultos() {
        this.numBultos = pedidos.size();
    }

    public void calcularPesoTotal() {
        int suma = 0;
        for (Pedido pedido : pedidos) {
            suma += pedido.peso();
        }
        this.pesoTotal = suma;
    }

    @Override
    public boolean tratar() {
        return ((pedidos.size() == getNumBultos()) && (pesoTotal > 0));
    }

    public double getNumBultos() {
        return numBultos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }
}
