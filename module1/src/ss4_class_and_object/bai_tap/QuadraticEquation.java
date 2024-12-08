package ss4_class_and_object.bai_tap;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }else {
            return 0;
        }
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("nhập giá trị a: ");
        double a = sc.nextDouble();
        System.out.println("nhập giá trị b: ");
        double b = sc.nextDouble();
        System.out.println(" nhập giá trị c");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("phương trình có 2 nghiệm phân biệt: ");
            System.out.println("nghiệm r1 = " + equation.getRoot1());
            System.out.println(" nghiệm r2 = "+ equation.getRoot2());
        }else if (delta == 0) {
            System.out.println(" phương trình có nghiệm kép: ");
            System.out.println(" nghiệm r1 = r2 = " + equation.getRoot1());
        }else {
            System.out.println("phương trình vô nghiệm (delta < 0).");
        }
        sc.close();
    }
}
