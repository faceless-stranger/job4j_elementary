package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {

    @Test
    void calculate() {
       int[] result = Square.calculate(5);
       int[] expected = new int[] {0, 1, 4, 9, 16};
       assertThat(result).containsExactly(expected);
    }
}