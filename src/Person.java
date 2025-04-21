import java.time.LocalDate;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;
    protected boolean isFemale;

    public Person(String firstName, String lastName, LocalDate birthDate, boolean isFemale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.isFemale = isFemale;
    }

    public abstract float getIncome();

    public boolean isFemale() {
        return isFemale;
    }

    public void giveBirth() {
        if (!isFemale) {
            throw new UnsupportedOperationException("Only females can give birth.");
        }
        System.out.println(firstName + " gave birth.");
    }

    public void joinArmy() {
        if (isFemale) {
            throw new UnsupportedOperationException("Only males can join the army.");
        }
        System.out.println(firstName + " joined the army.");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + firstName + " " + lastName;
    }
}
