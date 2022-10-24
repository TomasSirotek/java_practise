package jTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingClassTest {
    @Test
    void xPlusYShouldEqualSix(){
        var testingClass = new TestingClass();
        assertEquals(4,testingClass.sum(2,2)); // 1. expected 2.testing method;
    }

    @Test
    void xPlusYShouldEqualEight(){
        var testingClass = new TestingClass();
        assertEquals(10,testingClass.sum(3,7)); // 1. expected 2.testing method;
    }
}