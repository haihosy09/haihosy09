package ss6_inheritance.bai_tap.point_va_moveablepoint;

public class Run {
    public static void main(String[] args) {
        Point point = new Point(1.5f, 2.5f);
        System.out.println("point: " + point);
        point.setXY(3.0f,4.0f);
        System.out.println("tọa độ point: " + point.toString());

        MovablePoint movablePoint = new MovablePoint(1.0f,2.0f,0.5f,0.5f);
        System.out.println("movablePoint: " + movablePoint);
        movablePoint.move();
        System.out.println(" sau khi di chuyển :"+ movablePoint);


    }
}
