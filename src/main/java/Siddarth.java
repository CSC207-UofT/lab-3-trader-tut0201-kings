public class Siddarth implements Tradable, Domesticatable   {
    private boolean fiend;


    public Siddarth(){
        fiend = true;
    }

    /**
     *
     * @return the sound that Siddarth makes
     */
    @Override
    public String sound() {
        return "dripdarth dripgar";
    }

    /**
     *
     * @return The price of Siddarth in Kuwaiti Dinar
     */
    @Override
    public int getPrice() {
        return -1000000;
    }

    /**
     *
     * @return Whether Siddarth is criminal
     */
    public boolean isCriminal(){
        return false;
    }



}
