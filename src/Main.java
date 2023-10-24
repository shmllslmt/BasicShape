import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Shape bentuk = new Shape();
        Circle bulat = new Circle(5.5);
        Rectangle segiempat = new Rectangle("Rectangle", 4, 4);
        Triangle segitiga = new Triangle();

        System.out.println(bentuk);

        bulat.setName("Circle");
        System.out.println(bulat);
        System.out.println(segiempat);

        segitiga.setBase(10);
        segitiga.setHeight(15);
        segitiga.setSideA(7);
        segitiga.setSideB(7);
        System.out.println(segitiga);
    }
}