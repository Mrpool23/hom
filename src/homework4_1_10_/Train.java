package homework4_1_10_;
public class Train extends Transport
{
    public Train(int speed, int fuel, int pf, double tarif) {
        super(speed, fuel, pf, tarif);
    }

    public double gettarif() {
        return super.gettarif();
    }

    public int getFuel() {
        return super.getFuel();
    }

    public int getpf() {
        return super.getpf();
    }

    public int getSpeed() {
        return super.getSpeed();
    }

    public String toString() {
        return "Train";
    }
}
