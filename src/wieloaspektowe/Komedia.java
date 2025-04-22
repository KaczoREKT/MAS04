package wieloaspektowe;

public class Komedia extends Ksiazka {
    private int poziomSmiesznosci;

    public Komedia(Stan stan, String tytul, int poziomSmiesznosci) {
        super(stan, tytul);
        this.poziomSmiesznosci = poziomSmiesznosci;
    }
}
