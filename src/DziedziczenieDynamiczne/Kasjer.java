package DziedziczenieDynamiczne;

public class Kasjer extends Osoba {
    private float wyplata;

    public Kasjer(Osoba poprzedniaOsoba, float wyplata) {
        super(poprzedniaOsoba.imie, poprzedniaOsoba.nazwisko, poprzedniaOsoba.dataUrodzenia);
        this.wyplata = wyplata;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " jest Kasjerem z wypłatą: " + wyplata + ".";
    }
}
