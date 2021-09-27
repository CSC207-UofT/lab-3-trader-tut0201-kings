public class Lambo implements Drivable{

    public String driver_name;
    public String colour;
    public double speed;


    public Lambo() {
        this.driver_name = "autonomous";
        this.colour = "yellow";
        this.speed = 200.00;
    }

    public Lambo(String n, String c, double s) {
        this.driver_name = n;
        this.colour = c;
        this.speed = s;
    }

    @Override
    public String toString() {
        return speed + " on tha dash!!!!!!!!!!!!!!1";
    }


    @Override
    public void upgradeSpeed() {
        this.speed += 50;
    }

    @Override
    public void downgradeSpeed() {
        this.speed -= 50.00;
    }

    @Override
    public int getMaxSpeed() {
        return (int) this.speed;
    }
}
