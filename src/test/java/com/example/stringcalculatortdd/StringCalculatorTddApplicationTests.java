package com.example.stringcalculatortdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringCalculatorTddApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testEmptyString(){
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void testOneNumber(){
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void testTwoNumbers(){
        assertEquals(6, StringCalculator.add("1,5"));
    }

}
