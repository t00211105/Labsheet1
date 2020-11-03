package W5.lab9.excercise2;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        super("Circle");
        setRadius(0);
    }
    public  Circle(double radius){
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI*getRadius()*getRadius();
    }

    public double perimeter() {
        return 2*Math.PI*getRadius();
    }

    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
