package homework4_1_4_;
public class Matrix
{
    static double[][] array = new double[][]{{1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}};
    static int a = 3;
    static int b = 3;
    public static void summa(double[][] mt)
    {
        for(int i = 0; i < a; ++i)
        {
            for(int j = 0; j < b; ++j)
            {
                double[] var1 = array[i];
                var1[j] += mt[i][i];
            }
        }

    }

    public static void ARR()
    {
        for(int i = 0; i < a; ++i)
        {
            for(int j = 0; j < b; ++j)
            {
                System.out.print(array[i][j] + " ");
            }

            System.out.print("\n");
        }

        System.out.print("\n");
    }

    public static void umnoj(int v)
    {
        for(int i = 0; i < a; ++i)
        {
            for(int j = 0; j < b; ++j)
            {
                double[] var1 = array[i];
                var1[j] *= (double)v;
            }
        }

    }
}
