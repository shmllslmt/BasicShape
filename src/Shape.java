public class Shape {
    private String name;

    // no-arg constructor
    public Shape() {
        name = "Shape";
    }

    // parameterized constructor
    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calcArea() {
        return 0.0;
    }
    public double calcPerimeter() {
        return 0.0;
    }
}
