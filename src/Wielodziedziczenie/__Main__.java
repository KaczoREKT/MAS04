package Wielodziedziczenie;

public class __Main__ {
    public static void main(String[] args) {
        Kucharz kucharz = new Kucharz("Adrian", 666);
        kucharz.pokazInformacje();

        KucharzInfluencer kucharzInfluencer = new KucharzInfluencer(kucharz, "Foxx Gotuje", 456000);
        kucharzInfluencer.pokazInformacje();
    }
}
