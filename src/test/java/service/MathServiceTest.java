package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

    private MathService mathService;

    @BeforeEach
    void setUp() {
        mathService = new MathService();
    }

    @Test
    void sumar() {
        int result = mathService.sumar(10, 2);
        assertEquals(12, result);
    }

    @Test
    void restar() {
        int result = mathService.restar(10, 2);
        assertEquals(8, result);
    }

}