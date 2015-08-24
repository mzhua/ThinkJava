package lesson1_7;

/**
 * Created by Hua on 2015/8/23.
 */
public class Shape {
    void draw(){
        System.out.println("draw shape");
    }
    void erase(){
        System.out.println("erase shape");
    }

    public void doSomething(Shape shape){
        shape.draw();
        shape.erase();
    }
}
