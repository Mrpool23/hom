package homework2.home;
public class CircleTest
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);

        boolean areEquals = circle1.Equals(circle2);

        System.out.println(String.format("1) Радиус: %s\nДиаеметр: %s\nПлощадь: %s\nДлина окружности: %s",circle1.GetRadius(),circle1.GetSquare(),circle1.GetLength(),circle1.GetDiameter()));
        System.out.println(String.format("2) Радиус: %s\nДиаеметр: %s\nПлощадь: %s\nДлина окружности: %s",circle2.GetRadius(),circle2.GetSquare(),circle2.GetLength(),circle2.GetDiameter()));
    }
}
