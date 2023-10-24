public class Circle extends Shape {
    private double radius;

    public Circle() {
        this(0.0);
    }
    public Circle(double radius) {
        this("Shape", radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRadius: "+ radius +
                "\nArea: "+ calcArea() +
                "\nPerimeter: "+ calcPerimeter();
    }
}
