package it.develhope.overload;

/**
 * This class represents a Shape
 *
 * @author Tania Ielpo
 */

public class Shape {
    public String shapeName;
    public int numberOfEdges;

    /**
     *Creates a new Shape with no params and informs of creation
     */
    public Shape(){
        System.out.println("A new Shape Object has been created");
        this.shapeName="Undefined shape";
    }

    /**
     * Creates a Circle Shape and informs of creation
     * @param radius double that indicates the circle radius
     */

    public Shape(double radius){
        System.out.println("A circle has been created");
        this.shapeName="Circle";

    }

    /**
     * creates a Square Shape and informs of creation
     * @param edges number of edges
     * @param edgeLength Length of an edge
     */
    public Shape(int edges, double edgeLength){
        System.out.println("A square has been created");
        this.shapeName="Square";
        this.numberOfEdges=edges;
    }

    /**
     * create a Rectangle Shape and informs of creation
     * @param edges number of edges
     * @param e1 length of an edge
     * @param e2 width of another edge
     */
    public Shape(int edges, double e1, double e2){
        System.out.println("A rectangle has been created");
        this.shapeName="Rectangle";
        this.numberOfEdges=edges;
    }

    /**
     * Creates a triangle
     * @param edges number of edges
     * @param e1 length of edge 1
     * @param e2 length of edge 2
     * @param e3 length of edge 3
     */

    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("A triangle has been created");
        this.shapeName="Triangle";
        this.numberOfEdges=edges;
    }

    /**
     * saves in a string the shape details as name and number of edges
     * @return  String with details
     */

    public String getShapeDetails(){
        return "The name of the shape is: "+this.shapeName+". It has "+this.numberOfEdges+" edges.";
    }
}
