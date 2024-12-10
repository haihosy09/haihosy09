package ss6_inheritance.bai_tap.circle_va_cylinder;

public class Cylinder  extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }
    public double getSurfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }
    @Override
    public String toString() {
        return "Cylinder["+ super.toString() + "height=" + height + "]";
    }

}
