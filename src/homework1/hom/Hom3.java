package homework1.hom;
public class Hom3
{
    public static void main(String[] args)
    {
        int[] mas = new int[5];
        int sum = 0;
        for(int i = 0; i < mas.length; i++)
        {
            mas[i] = i + 1;
            sum += mas[i];
        }
        int arithmeticMean = sum/(mas.length);
        System.out.println("Сумма элементов: "+ sum);
        System.out.println("Средняя арифметическая сумма: "+ arithmeticMean);
    }
}
