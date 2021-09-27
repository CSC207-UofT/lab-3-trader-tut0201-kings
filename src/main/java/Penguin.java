class Penguin implements Tradable, Domesticatable {
    /**
     * Returns the price of the Penguin
     *
     * @return the price of a Penguin in CAD
     **/
    @Override
    public int getPrice() {
        return 10000000;
    }

    /**
     * Returns the sound that a Penguin makes
     *
     * @return the sound of a Penguin
     **/ 
    @Override
    public String sound() {
        return "MEEP";
    }

    /**
     * Provides the name of a given Penguin
     *
     * @return the name of the Penguin
     **/ public String getName() {
        return "Rico";
    }
}
