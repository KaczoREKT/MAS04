package DziedziczenieWieloaspektowe;

public abstract class Stan {
    protected Ksiazka ksiazka;

    protected void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
