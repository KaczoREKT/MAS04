package DziedziczenieDynamiczne;

import java.time.LocalDate;

public class Osoba {
    protected String imie;
    protected String nazwisko;
    protected LocalDate dataUrodzenia;

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " rok urodzenia " + dataUrodzenia;
    }
}
