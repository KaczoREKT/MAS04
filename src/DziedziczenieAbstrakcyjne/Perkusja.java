package DziedziczenieAbstrakcyjne;

public class Perkusja extends Instrument {
    public Perkusja(String nazwa) {
        super(nazwa, "Perkusyjny");
    }

    @Override
    public void dajDzwiek() {
        System.out.println("W pokoju rozchodzi się dźwięk bębnacji strun."); // Tak podpowiedział mi kompilator i uznałem to za śmieszne
    }
}
