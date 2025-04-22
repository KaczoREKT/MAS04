package wieloaspektowe;

import java.time.LocalDate;

public class Nowy extends Stan {
    private LocalDate dataDruku;

    public Nowy(LocalDate dataDruku) {
        this.dataDruku = dataDruku;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " z datą druku = " + dataDruku;
    }
}
