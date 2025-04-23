package DziedziczenieOverlapping;

import java.time.LocalDate;

public class __Main__ {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Michał", "Baron", LocalDate.of(1990,1,1));

        try {
            osoba.setMarkaPojazdu("BMW jakieś");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd przy ustawianiu pojazdu: " + e.getMessage());
        }

        try {
            String marka = osoba.getMarkaPojazdu();
            System.out.println("Marka pojazdu: " + marka);
        } catch (UnsupportedOperationException e) {
            System.out.println("Błąd przy pobieraniu pojazdu: " + e.getMessage());
        }
    }
}
