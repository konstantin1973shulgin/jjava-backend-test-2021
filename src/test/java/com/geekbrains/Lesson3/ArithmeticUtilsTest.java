package com.geekbrains.Lesson3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilsTest {

    @BeforeAll
    static void beforeAll() {

    }

    @BeforeEach
    void setUp() {
    }
    private static Stream<Arguments> params(){
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(7,-7,0),
                Arguments.of(5,5,10)
        );
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Тест суммы двух чисел")
    @ParameterizedTest(name = "{index}) {0} + {1} = {2}")
    @MethodSource("params")
    void sum(int x, int y, int expected) {
      int actuatly = ArithmeticUtils.sum(x,y);
      Assertions.assertEquals(expected, actuatly);


    }
}