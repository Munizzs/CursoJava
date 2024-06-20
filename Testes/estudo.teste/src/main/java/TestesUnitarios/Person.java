package TestesUnitarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person
{
    private String name;
    private LocalDate born;

    public Person(String name, LocalDate born) {
        this.name = name;
        this.born = born;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(born, LocalDate.now());
    }

    public boolean isLegalAge(){
        return getIdade()>=18;
    }
}
