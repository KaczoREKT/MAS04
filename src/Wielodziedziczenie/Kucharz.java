package Wielodziedziczenie;

public class Kucharz extends Osoba implements IKucharz {
    private int liczbaPosilkow;

    public Kucharz(String imie, int liczbaPosilkow){
        this.liczbaPosilkow = liczbaPosilkow;
    }

    @Override
    public int getLiczbaPosilkow() {
        return liczbaPosilkow;
    }

    @Override
    public void pokazInformacje() {
        System.out.println("TEN KUCHARZ UGOTOWAŁ AŻ: " + liczbaPosilkow + " POSIŁKÓW. ROBI WRAŻENIE!");
    }
}
