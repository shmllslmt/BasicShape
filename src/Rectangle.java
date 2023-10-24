import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructors
    // no-arg constructor
    public Rectangle() {
        this("Rectangle", 0.0, 0.0);
    }
    // parameterized constructor
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcPerimeter() {
        return width + width + height + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
