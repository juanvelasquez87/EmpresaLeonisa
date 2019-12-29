package io.jsVelasquez.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class PedidoTest {

    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;
    private Pedido pedido;

    private ArrayList<Producto> product = new ArrayList<Producto>();

    @Before
    public void setUp() throws Exception {


        leonisa = new Leonisa("jk002", 15000, "brasier", "34d", "blanco", "encaje");
        leo = new Leo("pk020", 7000, "boxer", "S", "azul", "poliester");
        teen = new Teen("jt003", 24000, "tanga", "S", "negro", "licra");

        product.add(leonisa);
        product.add(leo);
        product.add(teen);
    }

    @Test
    public void asignarProducto() {
        boolean asigLeonisa = product.contains(leonisa);
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
}