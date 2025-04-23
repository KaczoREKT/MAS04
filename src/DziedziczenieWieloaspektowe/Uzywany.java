package DziedziczenieWieloaspektowe;

public class Uzywany extends Stan {
    private String opisZuzycia;

    public Uzywany(String opisZuzycia) {
        this.opisZuzycia = opisZuzycia;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " z opisem zużycia = " + opisZuzycia;
    }
}
