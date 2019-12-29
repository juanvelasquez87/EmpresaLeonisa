package io.jsVelasquez.leonisa;

import org.junit.Before;

import static org.junit.Assert.*;

public class TeenTest {
    private Teen teen;
    @Before
    public void setUp() throws Exception {
        teen = new Teen("AFP001", 15000, "Panti", "S", "Blanco", "Algodón");
    }
}