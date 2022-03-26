package com.tdea.parcial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTests {


    @Test
    public void getTimeOfnocheTest() {
        String respuesta = "Nigth";

        String result = Utils.getTimeOfDay(4);

        assertEquals(result, "Night");

    }

    @Test
    public void getTimeOfmañanaTest() {
        String respuesta = "Morning";

        String result = Utils.getTimeOfDay(10);

        assertEquals(result, "Morning");




    }


    @Test
    public void getTimeOfAftardeTest() {
        String respuesta = "Afternoon";

        String result = Utils.getTimeOfDay(15);

        assertEquals(result, "Afternoon");




    }


    @Test
    public void getTimeOfmadrugadaTest() {
        String respuesta = "Evening";

        String result = Utils.getTimeOfDay(21);

        assertEquals(result, "Evening");




    }


    @Test
    public void getTimeOfErrorTest() {
        String respuesta = "Invalid hour";

        String result = Utils.getTimeOfDay(30);

        assertEquals(result, "Invalid hour");




    }
}


