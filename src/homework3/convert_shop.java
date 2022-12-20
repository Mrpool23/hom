package homework3;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;
public class convert_shop
{
    public static void main(String[] args)
    {
        DecimalFormat f = new DecimalFormat();
        int c = 12590;
        int b = 3500;
        Scanner scan = new Scanner(System.in);
        System.out.println("1 товар " + c + "руб. ");
        System.out.println("2 товар " + b + "руб. ");
        System.out.println("доступная валюта - доллар (1), евро (2)");
        int v = scan.nextInt();
        PrintStream var1;
        String var2;
        double d;
        switch (v)
        {
            case 1:
                d = (double)(c / 67.23);
                var1 = System.out;
                var2 = f.format(d);
                var1.println("1 товар " + var2 + " доллар. ");
                d = (double)(b / 67.23);
                var1 = System.out;
                var2 = f.format(d);
                var1.println("2 товар " + var2 + " доллар. ");
                break;
            case 2:
                d = (double)(c / 75);
                var1 = System.out;
                var2 = f.format(d);
                var1.println("1 товар " + var2 + " евро. ");
                d = (double)(b / 75);
                var1 = System.out;
                var2 = f.format(d);
                var1.println("2 товар " + var2 + " евро. ");
        }

    }
}
