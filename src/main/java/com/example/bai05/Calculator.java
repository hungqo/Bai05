package com.example.bai05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.info("Adding numbers: a={}, b={}", a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        logger.info("Subtracting numbers: a={}, b={}", a, b);
        return a - b;
    }

    public int multiply(int a, int b) {
        logger.info("Multiplying numbers: a={}, b={}", a, b);
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Division failed because divisor is zero. a={}, b={}", a, b);
            throw new IllegalArgumentException("Divisor must not be zero.");
        }

        logger.info("Dividing numbers: a={}, b={}", a, b);
        return a / b;
    }

    public int max(int a, int b) {
        logger.info("Finding max number: a={}, b={}", a, b);

        if (a > b) {
            return a;
        }

        return b;
    }
}