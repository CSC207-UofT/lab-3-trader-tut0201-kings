public class LorenaClass implements Tradable, Drivable {
    int speed;

    public LorenaClass(int speed) {
        this.speed = speed;
    }

    @Override
    public void upgradeSpeed() {
        this.speed += 1;
    }

    @Override
    public void downgradeSpeed() {
        this.speed -= 1 ;
    }

    @Override
    public int getMaxSpeed() {
        return 500;
    }

    @Override
    public int getPrice() {
        return 3000;
    }
}
