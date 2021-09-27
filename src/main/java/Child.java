public class Child implements Domesticatable, Tradable {
    /*Children are only identified by age*/
    private int age;

    public Child() {
        this.age = 8;
    }

    @Override
    /*Overrides the sound, because this is what a tradeable child would say */
    public String sound() {
        return "Mommy! Daddy! Where are you? I'm scared...";
    }

    @Override
    /*Obviously worth twice as much as a horse*/
    public int getPrice() {
        return 20;
    }

    public String cry() {
        /*Sound of child crying*/
        return "Waaaaaaaah!";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    /*The string for child should return its identifier: age*/
    public String toString(){
        String id = super.toString();
        return id + " (Age: " + this.age +")";
    }

}
