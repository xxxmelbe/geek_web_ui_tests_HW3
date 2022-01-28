package ru.geekbrains.lesson4.HomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ru.geekbrains.lesson4.HomeWork.TriangleSquareCalculation.calculateTriangleSquare;

public class TriangleTests {

    private org.assertj.core.api.AssertionsForClassTypes AssertionsForClassTypes;

    @Test
    @DisplayName("Позитивная проверка №1")
    void positiveSquareCalcTest1() throws Exception {
        double result = calculateTriangleSquare(3, 3, 3);
        Assertions.assertEquals(1.7320508075688772, result);
    }

    @Test
    @DisplayName("Позитивная проверка №2")
    void positiveSquareCalcTest2() throws Exception {
        double result = calculateTriangleSquare(3, 4, 5);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Позитивная проверка №3")
    void positiveSquareCalcTest3() throws Exception {
        double result = calculateTriangleSquare(5, 6, 7);
        Assertions.assertEquals(14.696938456699069, result);
    }

    @Test
    @DisplayName("Негативная проверка №1")
    void negativeSquareCalcTest1() {
        AssertionsForClassTypes.assertThatExceptionOfType(Exception.class).isThrownBy(() -> calculateTriangleSquare(-2, 4, 5));
    }

    @Test
    @DisplayName("Негативная проверка №2")
    void negativeSquareCalcTest2() {
        AssertionsForClassTypes.assertThatExceptionOfType(Exception.class).isThrownBy(() -> calculateTriangleSquare(0, 2, 2));
    }

    @Test
    @DisplayName("Негативная проверка №3")
    void negativeSquareCalcTest3() {
        AssertionsForClassTypes.assertThatExceptionOfType(Exception.class).isThrownBy(() -> calculateTriangleSquare(1, 2, 3));
    }
}

