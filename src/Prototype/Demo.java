package Prototype;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;

import Prototype.shapes.Circle;
import Prototype.shapes.Rectangle;
import Prototype.shapes.Shape;

public class Demo {

    private static void cloneShapeList(List<Shape> shapes, List<Shape> shapesCopy){
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
    }
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneShapeList(shapes, shapesCopy);

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i+": Shapes are different objects(copied!)");

                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i+": They are idential");
                } else {
                    System.out.println(i+": They are not idential");
                }
            }else{
                System.out.println(i + ": Shape object are same(not copied)");
            }
        }
    }
}
