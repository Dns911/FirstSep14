package com.epam.practise.lesson3110;

import java.util.StringJoiner;

public class Point2D extends Point1D{
    private int y;

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Point2D.class.getSimpleName() + "[", "]")
                .add("y=" + y)
                .toString();
    }
}
