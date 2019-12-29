package io.jsVelasquez.leonisa;

public class Producto {

     private String ciu;
     private int precio;
     private Categoria cat;



     public Producto(String ciu, int precio, String tipoPrenda, String talla, String color, String material){
         cat = new Categoria(tipoPrenda, talla, color, material);
         this.ciu = ciu;
         this.precio = precio;
     }
     public Producto(){

     }


    public String getCiu() {
        return ciu;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
