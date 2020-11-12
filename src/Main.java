import models.Point2D;
import models.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 1);
        point2D.setXY();

        Point3D point3D = new Point3D(point2D, 3);
        point3D.setXYZ(point3D.getZ());

        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }
}
