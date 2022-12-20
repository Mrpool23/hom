package homework3;
public class work1
{
    public static void main(String[] args)
    {
        double doub = Double.valueOf(3.14);
        doub = Double.parseDouble("3.14");
        int Intt = (int)doub;
        float Floatt = (float)doub;
        byte Bytee = (byte)((int)doub);
        char Charr = (char)((int)doub);
        long Longg = (long)doub;
        System.out.print(doub);
        String d = Double.toString(3.14);
    }
}
