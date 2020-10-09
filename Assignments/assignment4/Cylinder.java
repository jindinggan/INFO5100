package assignment4;

public class Cylinder extends Circle {
    private double height = 1.0;

    Cylinder() {

    }

    Cylinder(double height) {
        super();
        this.height = height;
    }

    Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * super.getArea();
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * (super.getRadius() + this.height);
    }

    @Override
    public void printOutput() {
        System.out.println("Radius is " + super.getRadius() + ", Height is " + this.getHeight() + ", Color is "
                + super.getColor() + ", Base area is " + super.getArea() + ", Volume is " + this.getVolume());
    }
}
