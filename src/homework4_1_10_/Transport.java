package homework4_1_10_;
public abstract class Transport
{
    int speed;
    int fuel;
    int pf;
    double tarif;
    double km;

    public Transport(int speed, int fuel, int pf, double tarif) {
        this.speed = speed;
        this.fuel = fuel;
        this.pf = pf;
        this.tarif = tarif;
        this.km = (double)(fuel * pf / 100);
    }

    public double getkm() {
        return this.km;
    }

    public int getFuel() {
        return this.fuel;
    }

    public double gettarif() {
        return this.tarif;
    }

    public int getpf() {
        return this.pf;
    }

    public int getSpeed() {
        return this.speed;
    }

    public abstract String toString();
}
