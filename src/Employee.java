import java.time.LocalDate;

public class Employee extends Person {
    private float salary;

    public Employee(String firstName, String lastName, LocalDate birthDate, boolean isFemale, float salary) {
        super(firstName, lastName, birthDate, isFemale);
        this.salary = salary;
    }

    @Override
    public float getIncome() {
        return salary;
    }
}