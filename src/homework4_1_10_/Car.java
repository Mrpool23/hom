package homework4_1_10_;
public class Car extends Transport {
    public Car(int speed, int f, int pf, double tarif) {
        super(speed, f, pf, tarif);
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
        return "Car";
    }
}
