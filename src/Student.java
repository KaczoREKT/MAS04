import java.time.LocalDate;


public class Student extends Person {
    private float scholarship;

    public Student(String firstName, String lastName, LocalDate birthDate, boolean isFemale, float scholarship) {
        super(firstName, lastName, birthDate, isFemale);
        this.scholarship = scholarship;
    }

    @Override
    public float getIncome() {
        return scholarship;
    }
}
