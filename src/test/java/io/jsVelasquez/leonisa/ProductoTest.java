package io.jsVelasquez.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {
    Producto pro = new Producto();
    @Before
    public void setUp() throws Exception {
        pro = new Producto("jk001", 28000, "Brasier", "36", "Negro", "Poliester");
    }

    @Test
    public void getCiu() {
        Assert.assertEquals("El código no es el esperado", "jk001", pro.getCiu());
    }

    @Test
    public void getPrecio() {
        Assert.assertEquals("El precio no es el esperado", 28000, pro.getPrecio(), 0);
    }

    @Test
    public void setPrecio() {
        pro.setPrecio(28000);
        Assert.assertEquals("El precio no es el enviado", 28000, pro.getPrecio(), 0);
    }
}