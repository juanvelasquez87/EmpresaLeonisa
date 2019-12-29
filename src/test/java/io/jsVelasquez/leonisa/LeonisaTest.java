package io.jsVelasquez.leonisa;

import org.junit.Before;

import static org.junit.Assert.*;

public class LeonisaTest {
    private Leonisa leonisa;

    @Before
    public void setUp() throws Exception {
        leonisa = new Leonisa("jk002", 25000, "Brasier", "36D", "blanco", "Algodón");
    }
}