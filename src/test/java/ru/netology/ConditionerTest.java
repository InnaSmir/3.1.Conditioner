package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void IncreaseCurrentTemperature() {
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void DecreaseCurrentTemperature() {
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void ShouldGetAndSetMinTemperature() {
        assertEquals(0, conditioner.getMinTemperature());

        conditioner.setMinTemperature(-15);
        assertEquals(-15, conditioner.getMinTemperature());
        assertEquals(0, conditioner.getCurrentTemperature());

        conditioner.setMinTemperature(1);
        assertEquals(1, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(-15);
        conditioner.setMinTemperature(1);
        assertEquals(1, conditioner.getMinTemperature());
        assertEquals(1, conditioner.getCurrentTemperature());
    }

    @Test
    public void ShouldGetAndSetMaxTemperature() {
        assertEquals(0, conditioner.getMaxTemperature());

        conditioner.setMaxTemperature(20);
        assertEquals(20, conditioner.getMaxTemperature());
        assertEquals(0, conditioner.getCurrentTemperature());

        conditioner.setMaxTemperature(20);
        assertEquals(20, conditioner.getMaxTemperature());

        conditioner.setCurrentTemperature(10);
        conditioner.setMaxTemperature(5);
        assertEquals(5, conditioner.getMaxTemperature());
        assertEquals(10, conditioner.getCurrentTemperature());
    }

    @Test
    public void ShouldGetAndSetCurrentTemperature() {
        assertEquals(0, conditioner.getCurrentTemperature());

        conditioner.setMinTemperature(-15);
        conditioner.setMaxTemperature(15);

        conditioner.setCurrentTemperature(0);
        assertEquals(0, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(-15);
        assertEquals(-15, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(15);
        assertEquals(15, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(10);
        assertEquals(10, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(16);
        assertEquals(15, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldGetAndSet() {

        String expected = "Philips";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

}
