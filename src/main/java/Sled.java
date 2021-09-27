public class Sled implements Drivable, Tradable {
    private int maxSpeed;
    private String color;

    public Sled() {
        this.maxSpeed = 2;
        this.color = "red";
    }

    public Sled(String color) {
        this.maxSpeed = 2;
        this.color = color;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 5;
    }

    public String getColor() {
        return this.color;
    }

    public void paint(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
