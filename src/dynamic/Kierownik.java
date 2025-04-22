package dynamic;

import java.time.LocalDate;

public class Kierownik extends Osoba {
    protected LocalDate dataZatrudnienia;

    public Kierownik(Osoba poprzedniaOsoba, LocalDate dataZatrudnienia) {
        super(poprzedniaOsoba.imie, poprzedniaOsoba.nazwisko, poprzedniaOsoba.dataUrodzenia);
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " jest Kierownikiem od " + dataZatrudnienia + ".";
    }
}
