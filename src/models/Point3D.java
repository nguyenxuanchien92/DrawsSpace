package models;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    private float[] array = new float[3];
    private Point2D point2D;

    public Point2D getPoint2D() {
        return point2D;
    }

    public void setPoint2D(Point2D point2D) {
        this.point2D = point2D;
    }

    public Point3D(Point2D point2D, float z) {
        this.point2D = point2D;
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

    public void setXYZ(float z) {
        array[0] = this.point2D.getXY()[0];
        array[1] = this.point2D.getXY()[1];
        array[2] = z;
    }

    public float[] getXYZ() {
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{ x = " + this.getXYZ()[0] + ", y = " + this.getXYZ()[1] +
                ", z=" + z +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
