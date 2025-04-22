package overlapping;

import java.time.LocalDate;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;

public class Osoba {
    private final String imie;
    private final String nazwisko;
    private final LocalDate dataUrodzenia;
    private final EnumSet<OsobaStanowisko> stanowiska = EnumSet.of(OsobaStanowisko.KELNER);


    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    // KUCHARZ
    private boolean maKsiazeczkeLekarska;

    // KELNER
    private List<String> listaStolikow;

    // DOSTAWCA
    private String markaPojazdu;


    public void setMarkaPojazdu(String markaPojazdu) {
        if (!stanowiska.contains(OsobaStanowisko.DOSTAWCA)) {
            throw new IllegalArgumentException("Osoba nie jest dostawcą.");
        }
        this.markaPojazdu = markaPojazdu;
    }

    public String getMarkaPojazdu() {
        if (!stanowiska.contains(OsobaStanowisko.DOSTAWCA)) {
            throw new UnsupportedOperationException("Osoba nie jest dostawcą.");
        }
        return markaPojazdu;
    }
}
