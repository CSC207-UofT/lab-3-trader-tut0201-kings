public class Siddarth implements Tradable, Domesticatable   {
    public boolean fiend;


    public Siddarth(){
        fiend = true;
    }
    @Override
    public String sound() {
        return "dripdarth dripgar";
    }

    @Override
    public int getPrice() {
        return -1000000;
    }

    /**
     *
     * @return an integer that represents siddarth's innocense
     */
    public boolean isCriminal(){
        return false;
    }



}
