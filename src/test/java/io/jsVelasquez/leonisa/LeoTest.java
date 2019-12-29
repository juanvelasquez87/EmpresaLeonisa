package io.jsVelasquez.leonisa;

import org.junit.Before;

import static org.junit.Assert.*;

public class LeoTest {
    private Leo men;

    @Before
    public void setUp() throws Exception {
        men = new Leo("pk001", 18000, "Boxer", "S", "Negro", "Poli/algodon");
    }
}