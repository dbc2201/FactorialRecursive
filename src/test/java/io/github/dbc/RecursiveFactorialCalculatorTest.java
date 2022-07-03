package io.github.dbc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveFactorialCalculatorTest {

    @ParameterizedTest(name = "factorial({0}) = {1}")
    @CsvSource(value = {
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "6, 720",
            "7, 5040",
            "8, 40320",
            "9, 362880",
            "10, 3628800"
    })
    void factorial(int number, int expected) {
        assertEquals(expected, RecursiveFactorialCalculator.factorial(number));
    }
}