package ss6_inheritance.bai_tap.circle_va_cylinder;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"blue");
        System.out.println(circle);
        System.out.println(" diện tích hình tròn là :"+ circle.getArea());

        Cylinder cylinder = new Cylinder(5,"green", 10);
        System.out.println(cylinder);
        System.out.println(" thể tích hình trụ là " + cylinder.getVolume());
        System.out.println(" diện tích bề mặt hình trụ :"+ cylinder.getSurfaceArea());
    }
}
