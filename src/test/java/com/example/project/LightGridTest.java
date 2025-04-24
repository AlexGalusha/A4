package com.example.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;




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
    assertEquals(9, grid.countLit(), "3x3 block result in 9 lights  lit");
}

@Test
void turnOff_SinglePreviouslyLitLight_LightIsOff() {
    LightGrid grid = new LightGrid();
    grid.turnOn(0, 0, 0, 0);   // Turn on one light
    grid.turnOff(0, 0, 0, 0);  // Turn it back off
    assertEquals(0, grid.countLit(), "Light should be off after being turned off");
}

@Test
void toggle_SingleOffLight_LightIsOn() {
    LightGrid grid = new LightGrid();
    grid.toggle(0, 0, 0, 0);  // Toggle one light
    assertEquals(1, grid.countLit(), "Light should be on after changing from off");
}
@Test
void toggle_FullRow_OneThousandLightsAreLit() {
    LightsGrid grid = new LightGrid();
    grid.toggle(0, 0, 999, 0);
    assertEquals(100, grid.countLit());
}

}

