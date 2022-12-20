package homework4_1_10_;
public class MainTRANSPRT {
    public MainTRANSPRT() {
    }
    public static void main(String[] args)
    {
        double rast = 2.0;
        Transport[] transports = new Transport[]{new Car(80, 10, 50, 2.0), new Plane(950, 2800, 51, 1.9), new Train(200, 400, 52, 0.9), new Ship(20, 250, 5, 3.0)};
        Transport[] var10 = transports;
        int var11 = transports.length;

        for(int var12 = 0; var12 < var11; ++var12) {
            Transport transport = var10[var12];
            double time = rast / (double)transport.getSpeed();
            double price = transport.getkm() * rast;
            double tarif = price * transport.gettarif();
            System.out.println("\nТип транспорта " + transport);
            System.out.println("Время перевозки " + time * 60.0 + " минут");
            System.out.println("Цена перевозки пассажира " + price + "руб");
            System.out.println("Цена перевозки груза " + tarif + "руб");
        }

    }
}
