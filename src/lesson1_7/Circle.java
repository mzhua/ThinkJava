package lesson1_7;

/**
 * Created by Hua on 2015/8/23.
 */
public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("draw circle");
    }

    @Override
    void erase() {
        System.out.println("erase circle");

    }
}
