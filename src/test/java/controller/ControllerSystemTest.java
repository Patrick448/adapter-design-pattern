package controller;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControllerSystemTest {

    @Test
    void deveRetornarTeclasPS4(){
        ControllerSystem controllerSystem = new ControllerSystem();
        controllerSystem.pressKey("square");
        controllerSystem.pressKey("x");

        assertEquals(Arrays.asList("square", "x"), controllerSystem.getKeysPressed());
    }

    @Test
    void deveRetornarTeclasXbox(){
        ControllerSystem controllerSystem = new ControllerSystem();
        controllerSystem.pressKey("triangle");
        controllerSystem.pressKey("circle");

        assertEquals(Arrays.asList("b", "y"), controllerSystem.getXboxKeys());
    }


}