package homework4_1_2_;
public class Phone
{
    String number;
    String model;
    int weight;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return this.number;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model)
    {
        this.model = model;
        this.number = number;
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " номер " + number);
    }

    public void sendMessage(Object... obj) {
        Object[] var2 = obj;
        int var3 = obj.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Object o = var2[var4];
            System.out.println(o.toString() + " ");
        }

    }

    public String toString()
    {
        return "Phone{number='" + this.number + "', model='" + this.model + "', weight=" + this.weight + "}";
    }
}
