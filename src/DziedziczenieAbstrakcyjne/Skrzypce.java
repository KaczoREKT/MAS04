package DziedziczenieAbstrakcyjne;

public class Skrzypce extends Instrument {
    public Skrzypce(String nazwa){
        super(nazwa,"Dęty");
    }

    @Override
    public void dajDzwiek() {
        System.out.println("W pokoju rozchodzi się dźwięk wibracji strun.");
    }
}
