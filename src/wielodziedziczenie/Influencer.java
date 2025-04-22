package wielodziedziczenie;

public class Influencer extends Osoba{
    private String nazwa;
    private float liczbaObserwatorow;

    public Influencer(String nazwa, float liczbaObserwatorow) {
        this.nazwa = nazwa;
        this.liczbaObserwatorow = liczbaObserwatorow;
    }

    public float getLiczbaObserwatorow() {
        return liczbaObserwatorow;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public void pokazInformacje() {
        System.out.println("TEN INFLUENCER MA AŻ " + liczbaObserwatorow + " OBSERWATORÓW. BEZ ŻYCIA!!!");
    }
}
