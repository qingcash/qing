/**
 * 验证多形性
 *
 * @author Terry.W
 * @date 2018-12-14 16:57
 **/


class Shape {
    void draw() {}
    void erase() {}
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Circle.erase()");
    }
}
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    void erase() {
        System.out.println("Square.erase()");
    }
}
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    void erase() {
        System.out.println("Triangle.erase()");
    }
}
public class Shapes {
    public static Shape randShape() {
        switch((int)(Math.random() * 3)) {
            default: // To quiet the compiler
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
// Fill up the array with shapes:
        for(int i = 0; i < s.length; i++){
            s[i] = randShape();
        }
// Make polymorphic method calls:
        for(int i = 0; i < s.length; i++){
            s[i].draw();
        }
    }
} ///:
