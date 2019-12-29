package io.jsVelasquez.leonisa;

import com.sun.xml.internal.bind.v2.runtime.SchemaTypeTransducer;

import java.util.ArrayList;

public class Pedido {
    private int cantidadUnidad;
    private String medioPago;
    private double descuento;
    private int prontoPago;

    private ArrayList<Producto> product = new ArrayList<Producto>();
    private ArrayList<Producto> productoArr = new ArrayList<Producto>();


    public Pedido(){

    }

    public Pedido(int cantidadUnidad, String medioPago, double descuento, int prontoPago) {
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

    public double totalCompra(double precio){
        double totalCompra = 0;
        totalCompra = precio * this.cantidadUnidad;
        return  totalCompra;
    }

}