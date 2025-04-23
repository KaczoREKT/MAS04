package DziedziczenieWieloaspektowe;


public abstract class Ksiazka {
    private String tytul;
    private Stan stan;

    public Ksiazka(Stan stan, String tytul) {
        this.tytul = tytul;
        this.stan = stan;
        stan.setKsiazka(this);
    }

    public String getTytul() {
        return tytul;
    }

    @Override
    public String toString() {
        return "Książka o nazwie '" + tytul + "' w stanie: " + stan + ".";
    }
}
