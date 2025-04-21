import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person anna = new Student("Anna", "Nowak", LocalDate.of(2000, 5, 12), true, 1500);
        Person jan = new Employee("Jan", "Kowalski", LocalDate.of(1985, 3, 9), false, 4500);
        Person stefan = new Retired("Stefan", "Malinowski", LocalDate.of(1950, 2, 1), false, 2500);

        System.out.println(anna);  // Student: Anna Nowak
        System.out.println("Income: " + anna.getIncome());
        anna.giveBirth();

        System.out.println(jan);   // Employee: Jan Kowalski
        System.out.println("Income: " + jan.getIncome());
        jan.joinArmy();

        System.out.println(stefan); // Retired: Stefan Malinowski
        System.out.println("Income: " + stefan.getIncome());
        stefan.joinArmy();
    }
}
