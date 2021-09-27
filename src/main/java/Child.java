public class Child implements Domesticatable, Tradable {
    private int age;

    public Child() {
        this.age = 8;
    }

    @Override
    public String sound() {
        return "Mommy! Daddy! Where are you? I'm scared...";
    }

    @Override
    public int getPrice() {
        return 20;
    }

    public String cry() {
        return "Waaaaaaaah!";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Age: " + this.age +")";
    }

}
