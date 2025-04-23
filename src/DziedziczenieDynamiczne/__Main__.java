package DziedziczenieDynamiczne;

import java.time.LocalDate;

public class __Main__ {
    public static void main(String[] args) {

        // Dynamic
        Osoba osoba = new Osoba("Jan", "Ciumkalski", LocalDate.of(1990,1,1)); // 15 maja 1990
        System.out.println(osoba);
        osoba = new Kasjer(osoba, 2166.50f);
        System.out.println(osoba);
        osoba = new Kierownik(osoba, LocalDate.of(2000,5,20)); // przybliżona data zatrudnienia
        System.out.println(osoba);

    }
}
