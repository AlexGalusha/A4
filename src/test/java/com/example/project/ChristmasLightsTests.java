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
        assertEquals(1, grid.countLit(), "Exactly one light should be lit");
    }

    @Test
void turnOn_ThreeByThreeBlock_NineLightsAreLit() {
    LightGrid grid = new LightGrid();
    grid.turnOn(0, 0, 2, 2); // 3x3 block
    assertEquals(9, grid.countLit(), "3x3 block should result in 9 lights being lit");
}


}

