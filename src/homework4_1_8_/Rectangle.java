package homework4_1_8_;

public class Rectangle extends Shape {
     double width;
     double length;
    public Rectangle() {

    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
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
