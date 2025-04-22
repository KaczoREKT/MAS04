package wieloaspektowe;

public class Kuchnia extends Ksiazka {
    private String typKuchni;

    public Kuchnia(Stan stan, String tytul, String typKuchni) {
        super(stan, tytul);
        this.typKuchni = typKuchni;
    }
}
