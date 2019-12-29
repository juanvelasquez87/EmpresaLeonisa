package io.jsVelasquez.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class PedidoTest {
    private Pedido pedidoLeonisa;
    private Pedido pedidoLeo;
    private Pedido pedidoTeen;
    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;
    private Pedido pedido;


    private ArrayList<Producto> product = new ArrayList<Producto>();


    @Before
    public void setUp() throws Exception {

        pedidoLeonisa = new Pedido(8, "Efectivo", 0,0);
        pedidoLeo = new Pedido(12, "Pago efectivo", 0,0);
        pedidoTeen = new Pedido(6, "Pago efectivo", 0,0);
        leonisa = new Leonisa("jk002", 15000, "brasier", "34d", "blanco", "encaje");
        leo = new Leo("pk020", 7000, "boxer", "S", "azul", "poliester");
        teen = new Teen("jt003", 24000, "tanga", "S", "negro", "licra");


    }

    @Test
    public void asignarProducto() {
        boolean asigLeonisa= product.contains(leonisa);
        Assert.assertTrue("No se ha asignado producto 'Leonisa' al pedido", asigLeonisa);
    }

    @Test
    public void testAsignarProducto() {
        boolean asigLeo = product.contains(leo);
        Assert.assertTrue("No se ha asignado producto 'Leo' al pedido", asigLeo);
    }

    @Test
    public void testAsignarProducto1() {
        boolean asigTeen = product.contains(teen);
        Assert.assertTrue("No se ha asignado producto 'Teen' al pedido", asigTeen);
    }

    @Test
    public void asignarProductoTeenTest(){
        boolean asignadoTeen = product.contains(teen);
        Assert.assertTrue("No se ha asignado un producto 'Teen' al pedido", asignadoTeen);
    }

    @Test
    public void totalCompraTestLeonisa(){
        Assert.assertEquals("El total de la compra no es el esperado", 120000, pedidoLeonisa.totalCompra(leonisa.getPrecio()), 0);
    }

    @Test
    public void totalCompraTestLeo(){
        Assert.assertEquals("El total de la compra no es el esperado", 84000, pedidoLeo.totalCompra(leo.getPrecio()), 0);
    }

    @Test
    public void totalCompraTestTeen(){
        Assert.assertEquals("El total de la compra no es el esperado", 144000, pedidoTeen.totalCompra(teen.getPrecio()), 0);
    }


}