package homework4;
public enum Season
{
    SUMMER(30),
    AUTUMN(10),
    WINTER(-10)
            {
        public void getDescription()
        {

            System.out.println("Холодное время года");
        }
    },
    VESNA(15);

    int a;

    private Season(int a) {
        this.a = a;
    }

    public void getDescription()
    {
        System.out.println("Теплое время года");
    }

    public String toString()
    {
        String var10000 = this.name();
        return var10000 + " средняя температура = " + this.a;
    }
}
