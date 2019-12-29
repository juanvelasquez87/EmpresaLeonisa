package io.jsVelasquez.leonisa;

import java.util.ArrayList;

public class Pedido {
    private int cantidadUnidad;

    private ArrayList<Producto> product = new ArrayList<Producto>();


    public Pedido() {
    }

    public Pedido(int cantidadUnidad) {
        this.cantidadUnidad = cantidadUnidad;

    }


    public void asignarProducto(Leonisa leonisa){
        product.add(leonisa);

    }

    public void asignarProducto(Leo leo){
        product.add(leo);

    }

    public void asignarProducto(Teen teen){
        product.add(teen);

    }

}