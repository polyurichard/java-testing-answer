package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MathTest {
    static Math m;

    @BeforeAll
    //run once before all test cases start running
    public static void setup(){
        m = new Math();
    }
    
    @Test
    public void canAdd() {
        assertEquals(3, m.add(1, 2));
    }

    @Test
    public void canDivide() { 
        assertEquals(3, m.divide(6, 2), 0.01); //delta=0.01
    }
}