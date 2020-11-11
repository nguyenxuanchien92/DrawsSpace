package models;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    private float[] array = new float[3];

    public Point3D(Point2D point2D, float z) {
        super(point2D.getX(), point2D.getY());
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        array[0] = x;
        array[1] = y;
        array[2] = z;
    }

    public float[] getXYZ() {
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{ x = " + super.getX() + ", y = " + super.getY() +
                ", z=" + z +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
