package homework3;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class hom1
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число n");
        int n = scan.nextInt();
        double[] array = new double[n];
        System.out.print("1 способ\n");

        PrintStream var10000;
        double var10001;
        int k;
        for(k = 0; k < array.length; ++k) {
            array[k] = random.nextDouble() * 100.0;
            var10000 = System.out;
            var10001 = (double)Math.round(array[k] * 100.0);
            var10000.print(var10001 / 100.0 + " ");
        }

        System.out.print('\n');
        Arrays.sort(array);

        for(k = 0; k < array.length; ++k) {
            var10000 = System.out;
            var10001 = (double)Math.round(array[k] * 100.0);
            var10000.print(var10001 / 100.0 + " ");
        }

        System.out.print('\n');
        System.out.print("2 способ");
        System.out.print('\n');
        System.out.println("Введите число n");
        generate(scan.nextInt());
    }

    public static void generate(int n) {
        new Scanner(System.in);
        new Random();
        double[] array = new double[n];

        PrintStream var10000;
        double var10001;
        int k;
        for(k = 0; k < array.length; ++k) {
            array[k] = Math.random() * 100.0;
            var10000 = System.out;
            var10001 = (double)Math.round(array[k] * 100.0);
            var10000.print(var10001 / 100.0 + " ");
        }

        System.out.print('\n');
        Arrays.sort(array);

        for(k = 0; k < array.length; ++k) {
            var10000 = System.out;
            var10001 = (double)Math.round(array[k] * 100.0);
            var10000.print(var10001 / 100.0 + " ");
        }

    }
}
