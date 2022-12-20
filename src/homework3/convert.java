package homework3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class convert
{
    public static void main(String[] args)
    {
        DecimalFormat f = new DecimalFormat();
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - рубль");
        System.out.println("2 - доллар");
        System.out.print("Выберите вариант ");
        int v = scan.nextInt();
        System.out.println("Введите сумму");
        double a = (double)scan.nextFloat();
        switch (v)
        {
            case 1:
                double d = a / 67.23;
                System.out.println("" + a + " рубль = " + f.format(d) + " доллар");
                break;
            case 2:
                double r = a * 67.23;
                System.out.println("" + a + " доллар = " + f.format(r) + " рубль");
        }

    }
}
