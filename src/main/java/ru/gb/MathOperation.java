package ru.gb;

import java.util.Arrays;

public final class MathOperation {
    private MathOperation() {
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double... values) {
        return Arrays.stream(values).sum();
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Second argument cannot be zero!");
        }
        return a / b;
    }
}
