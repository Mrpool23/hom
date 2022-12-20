package homework4;

public class MainSEAS
{
    public static void main(String[] args)
    {
        System.out.println("Лето - мое любимое время года");
        Season[] var1 = Season.values();
        int var2 = var1.length;
        int var3 = 0;

        while(var3 < var2)
        {
            Season sea = var1[var3];
            System.out.println(sea.toString());
            sea.getDescription();
            switch (sea)
            {
                case SUMMER:
                    System.out.println("Я люблю лето\n");
                case AUTUMN:
                    System.out.println("Я люблю осень\n");
                case WINTER:
                    System.out.println("Я люблю зиму\n");
                case VESNA:
                    System.out.println("Я люблю осень весну\n");
                default:
                    ++var3;
            }
        }

    }
}
