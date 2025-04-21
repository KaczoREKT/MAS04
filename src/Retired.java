import java.time.LocalDate;

public class Retired extends Person {
    private float pension;

    public Retired(String firstName, String lastName, LocalDate birthDate, boolean isFemale, float pension) {
        super(firstName, lastName, birthDate, isFemale);
        this.pension = pension;
    }

    @Override
    public float getIncome() {
        return pension;
    }
}
