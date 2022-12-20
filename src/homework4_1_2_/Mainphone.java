package homework4_1_2_;
public class Mainphone
{
    public static void main(String[] args) {
        Phone phone = new Phone("88005553535", "sumsung", 450);
        Phone phone2 = new Phone("89295516365", "apple", 560);
        Phone phone3 = new Phone("8909999999", "xiaomi", 435);
        System.out.println(phone3);
        System.out.println(phone2);
        System.out.println(phone);
        phone.receiveCall("аноним");
        System.out.println(phone3.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone.getNumber());
        phone2.receiveCall("аноним2", "8905345813");
        phone3.sendMessage(new Object[]{"89342352445", "89348345242", "89991457390"});
    }
}
