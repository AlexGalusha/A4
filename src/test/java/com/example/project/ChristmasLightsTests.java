package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LightGridTest {

    @Test
    void turnOn_SingleLight_LightIsOn() {
        LightGrid grid = new LightGrid();
        grid.turnOn(0, 0, 0, 0);
        assertEquals(1, grid.countLit(), "one light lit");
    }

    @Test
void turnOn_ThreeByThreeBlock_NineLightsAreLit() {
    LightGrid grid = new LightGrid();
    grid.turnOn(0, 0, 2, 2); // 3x3 block
    assertEquals(9, grid.countLit(), "3x3 block  result in 9 lights  lit");
}

@Test
void turnOff_SinglePreviouslyLitLight_LightIsOff() {
    LightGrid grid = new LightGrid();
    grid.turnOn(0, 0, 0, 0);   // Turn on one light
    grid.turnOff(0, 0, 0, 0);  // Turn it back off
    assertEquals(0, grid.countLit(), "Light should be off after being turned off");
}



}

