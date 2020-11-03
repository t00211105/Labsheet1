package W5.lab9.excercise2;



public class TestAbstractClass {
    public static void main(String[] args) {


        Circle circle1 = new Circle();
        System.out.println("Details of first Circle object: \n" + circle1);

        Circle circle2 = new Circle(5.5);
        System.out.println("\n\nDetails of second Circle object: \n" + circle2);

        Rectangle rectangle1 = new Rectangle();
        System.out.println("\n\nDetails of first Rectangle object: \n" + rectangle1);

        Rectangle rectangle2 = new Rectangle(4.3, 1.8);
        System.out.println("\n\nDetails of second Rectangle object: \n" + rectangle2);

        Triangle triangle1 = new Triangle();

        Triangle triangle2 = new Triangle(3.24, 4.23, 5.78);

        Ellipse ellipse1 = new Ellipse();

        Ellipse ellipse2 = new Ellipse(5.62, 4.19);

        Shape[] allShapes = {circle1, circle2, rectangle1, rectangle2, triangle1, triangle2, ellipse1, ellipse2};

        System.out.println("\n\nDetails of all Shape objects contained in the Shape array: \n");
        for (int i = 0; i < allShapes.length; i++)
            System.out.println(allShapes[i] + "\n\n");


    }
}
