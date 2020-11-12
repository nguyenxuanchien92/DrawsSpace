package models;

import java.util.Arrays;

public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;
    private float[] array = new float[2];

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY() {
        this.array[0] = getX();
        this.array[1] = getY();
    }

    public float[] getArray(){
        return array;
    }

    public float[] getXY(){
        return getArray();
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
