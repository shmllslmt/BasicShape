public class Triangle extends Shape{
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    // no-arg constructor
    public Triangle() {
        this(0.0, 0.0, 0.0, 0.0);
    }
    // parameterized constructor with default value for super's name attribute
    public Triangle(double base, double height, double sideA, double sideB) {
        super("Triangle");
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    // parameterized constructor
    public Triangle(String name, double base, double height, double sideA, double sideB) {
        super(name);
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // getters or accessor methods

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    // setters or mutator methods
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    // overriding the super's task method with the subclass own implementation

    @Override
    public double calcPerimeter() {
        return base + sideA + sideB;
    }

    @Override
    public double calcArea() {
        return 1 / 2 * base * height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBase: "+ base +
                "\nHeight: "+ height +
                "\nFirst Side: "+ sideA +
                "\nSecond Side: "+ sideB +
                "\nArea: "+ calcArea() +
                "\nPerimeter: "+ calcPerimeter();
    }
}
