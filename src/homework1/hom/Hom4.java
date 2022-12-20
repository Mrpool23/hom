package homework1.hom;
import java.util.Scanner;
public class Hom4 {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            int[] ar = new int[10];
            for(int i = 0;i<10;i++)
            {
                ar[i]=input.nextInt();
            }
            int b = 0;
            int sum = 0;
            int max = 0;
            int min = 999999;
            while(b<10) {
                if (max < ar[b])
                {
                    max = ar[b];
                }
                if (min > ar[b])
                {
                    min = ar[b];
                }
                sum = sum + ar[b];
                b++;
            }
            System.out.println(sum + " - сумма элементов массива");
            System.out.println(max + " - максимальное значение массива");
            System.out.println(min + " - минимальное значение массива");
        }

}