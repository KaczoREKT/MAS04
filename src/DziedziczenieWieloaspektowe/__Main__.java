package DziedziczenieWieloaspektowe;

import java.time.LocalDate;
import java.util.Objects;

public class __Main__ {
    public static void main(String[] args) {
        Nowy nowyStan = new Nowy(LocalDate.of(1990,1,1));
        Komedia komedia = new Komedia(nowyStan, "50 twarzy Geja", 1000);

        Uzywany uzywanyStan = new Uzywany("Wylało się jajko ale nie śmierdzi");
        Kuchnia kuchnia = new Kuchnia(uzywanyStan, "Foxx vs Gotowanie", "Kuchnia nowoczesna");

        if (Objects.equals(nowyStan.ksiazka, komedia)) {
            System.out.println(komedia);
        }
        if (Objects.equals(uzywanyStan.ksiazka, kuchnia)) {
            System.out.println(kuchnia);
        }
    }
}
