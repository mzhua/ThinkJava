package lesson1_7;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square();
        Circle circle = new Circle();
        doSomething(square);
        doSomething(circle);
    }

    public static void doSomething(Shape shape) {
        shape.doSomething(shape);
    }
}
