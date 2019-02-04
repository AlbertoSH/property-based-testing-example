package com.adidas.sanzalb.testingday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassToBeTestedTest {

    private ClassToBeTested classToBeTested;

    @BeforeEach
    void setUp() {
        classToBeTested = new ClassToBeTested();
    }

    @Test
    void twoPlusTwoEqualsFour() {
        assertEquals(4, classToBeTested.sum(2, 2));
    }

    @Test
    void onePlusThreeEqualsFour() {
        assertEquals(4, classToBeTested.sum(1, 3));
    }

    @Test
    void onePlusOneEqualsTwo() {
        assertEquals(2, classToBeTested.sum(1, 1));
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @MethodSource("params")
    void severalOperations(int a, int b, int expected) {
        assertEquals(expected, classToBeTested.sum(a, b));
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments(2, 2, 4),
                Arguments.arguments(0, 2, 2),
                Arguments.arguments(4, 3, 7),
                Arguments.arguments(6, 10, 16)
        );
    }
}