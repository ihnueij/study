class Circle {
    private double radius;
    public double pi =3.14;//파이널이라 세터가 있을수 없다.

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        this.pi = 3.14;
    }

    public double getArea() {
        return radius * radius * pi;
    }

    public double getDulre() {
        return (radius * 2) * pi;

    }
}

public class Main2 {
    public static void main(String[] args) {
        Circle i = new Circle(5);
        System.out.println(i.getArea());
        System.out.println(i.getDulre());

    }
}
