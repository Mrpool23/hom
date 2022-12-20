package homework4_1_8_;
public class Circle extends Shape {
    protected double radius;
    public void Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getPerimeter() {
        return 0.0;
    }

    double gerArea() {
        return 0.0;
    }

    public String toString() {
        return super.toString();
    }
}
