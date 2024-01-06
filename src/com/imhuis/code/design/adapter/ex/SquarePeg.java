package com.imhuis.code.design.adapter.ex;

/**
 * @author: imhuis
 * @date: 2024/1/3
 * @description:
 */
public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
