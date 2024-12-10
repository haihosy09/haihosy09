package ss6_inheritance.bai_tap.point2d_va_point3d;

public class Run {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.5f, 2.5f);
        System.out.println("Point2d : " + point2D);
        point2D.setXY(3.0f,4.0f);
        System.out.println(" tọa độ point2d : " + java.util.Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D : " + point3D);
        point3D.setXYZ(4.0f, 5.0f,6.0f);
        System.out.println("tọa độ point3d : " + java.util.Arrays.toString(point3D.getXYZ()));
    }
}
