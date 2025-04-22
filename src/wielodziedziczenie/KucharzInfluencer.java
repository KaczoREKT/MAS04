package wielodziedziczenie;

public class KucharzInfluencer extends Influencer implements IKucharz {
    private Kucharz kucharz;

    public KucharzInfluencer(Kucharz kucharz, String nazwa, int liczbaObserwatorow) {
        super(nazwa, liczbaObserwatorow);
        this.kucharz = kucharz;
    }

    @Override
    public void pokazInformacje() {
        System.out.println("JAK DOBRY JEST TWÓJ INFLUENCER: " + getNazwa() + '\n');
        System.out.println("LICZBA WIDZÓW TEGO SYFU: " + getLiczbaObserwatorow());
        System.out.println("LICZBA UGOTOWANYCH POSIŁKÓW: " + getLiczbaPosilkow());
    }

    @Override
    public int getLiczbaPosilkow() {
        return kucharz.getLiczbaPosilkow();
    }
}