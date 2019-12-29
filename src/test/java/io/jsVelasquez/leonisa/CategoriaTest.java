package io.jsVelasquez.leonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoriaTest {
    Categoria cat;

    @Before
    public void setUp() throws Exception {
        cat = new Categoria("Brasier", "36", "Negro", "Poliester");

    }

    @Test
    public void getTipoPrenda() {
        Assert.assertEquals("El tipo de prenda no es el esperado", "Brasier", cat.getTipoPrenda());
    }

    @Test
    public void getTalla() {
        Assert.assertEquals("La talla no es la esperada", "36", cat.getTalla());
    }

    @Test
    public void getColor() {
        Assert.assertEquals("El color no es el esperado", "Negro", cat.getColor());
    }

    @Test
    public void getMaterial() {
        Assert.assertEquals("El material no es el esperado", "Poliester", cat.getMaterial());
    }
}