package homework4_1_8_;
public class Square extends Rectangle {
    public double side;

    public  Square() {
    }

    public  Square(double side) {
    }

    public  Square(String color, boolean filled, double side) {
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setLength(double length) {
        super.setLength(length);
    }

    public String toString() {
        return super.toString();
    }
}
