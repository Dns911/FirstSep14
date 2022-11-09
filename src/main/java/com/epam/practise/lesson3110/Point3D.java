package com.epam.practise.lesson3110;

public class Point3D extends Point2D{
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(int x, int y) {
        super(x, y);
    }
}
