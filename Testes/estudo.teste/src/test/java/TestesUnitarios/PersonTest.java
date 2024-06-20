package TestesUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonTest
{
    @Test
    void mustCalculateCorrectAge(){
        Person person = new Person("Lucas", LocalDate.of(2000,1,1));
        Assertions.assertEquals(24,person.getIdade());
    }

    @Test
    void mustBeLegalAge(){
        Person person = new Person("Lucas", LocalDate.of(2000,1,1));
        Assertions.assertTrue(person.isLegalAge());

        Person person2 = new Person("Clarissa", LocalDate.of(2009,10,5));
        Assertions.assertFalse(person2.isLegalAge());
    }
}
