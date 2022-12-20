package homework3;
import java.util.Random;
public class hom3
{
    public static void main(String[] args) {
        int[] a = new int[4];
        int i;
        for(i = 0; i < a.length; ++i) {
            a[i] = (new Random()).nextInt(10, 99);
            System.out.print(a[i] + " ");
        }

        System.out.print('\n');
        for(i = 1; i < a.length; ++i)
        {
            if (a[i - 1] >= a[i])
            {
                System.out.println("не возрастающая");
                break;
            }

            if (i == a.length - 1) {
                System.out.println("возрастающая");
            }
        }

    }
}
