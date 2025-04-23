package DziedziczenieAbstrakcyjne;

public abstract class Instrument {
    private final String nazwa;
    private final String typ;

    public Instrument(String nazwa, String typ) {
        this.nazwa = nazwa;
        this.typ = typ;
    }

    public abstract void dajDzwiek();

    @Override
    public String toString() {
        return nazwa + ": Instrument " + typ;
    }
}
