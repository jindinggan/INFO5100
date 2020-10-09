package assignment4;

public class TestCylinder {
    public static void main(String[] args) {
        //Constructed a Circle with Circle()
        //Run of the program should produce the following output:
        //Radius is 2.0, Color is yellow, Base area is (your answer)
        Circle circle = new Circle();
        circle.setColor("yellow");
        circle.setRadius(2.0);
        circle.printOutput();

        //Constructed a Cylinder with Cylinder()
        //Run of the program should produce the following output:
        //Radius is 1.0, Height is 1.0, Color is red, Base area is (your answer), Volume is (your answer)
        Cylinder cylinder = new Cylinder();
        cylinder.printOutput();

        //Constructed a Cylinder with Cylinder(height, radius)
        //Run of the program should produce the following output:
        //Radius is 2.0, Height is 5.0, Color is red, Base area is (your answer), Volume is (your answer)
        Cylinder cylinder1 = new Cylinder(5.0, 2.0);
        cylinder1.printOutput();
    }
}
