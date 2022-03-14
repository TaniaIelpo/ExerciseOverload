package it.develhope.overload;

/**
 * This class represents a Tester
 *
 * @author Tania Ielpo
 */

public class Tester {

    public static void main(String[] args) {

        //creation 5 shapes using 5 different constructor invocations
        Shape shape=new Shape();
        Shape circle=new Shape(3.7);
        Shape square=new Shape(4,4.4);
        Shape rectangle=new Shape(4,5.0,6.4);
        Shape triangle=new Shape(3, 4.0,3.2,5.4);

        //invocation get.ShapeDetails() whit 5 different just created Shapes
        String shapeDetail=shape.getShapeDetails();
        String circleDetail=circle.getShapeDetails();
        String squareDetail=square.getShapeDetails();
        String rectangleDetail=rectangle.getShapeDetails();
        String triangleDetail=triangle.getShapeDetails();

        //printing the details of the 5 different shapes
        System.out.println(shapeDetail);
        System.out.println(circleDetail);
        System.out.println(squareDetail);
        System.out.println(rectangleDetail);
        System.out.println(triangleDetail);
    }
}
