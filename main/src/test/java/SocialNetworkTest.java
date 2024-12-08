import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SocialNetworkTest {




    @Test
    public void testLocal(){

        List<Person> roster = List.of(
                new Person("Sam", LocalDate.of(2024,6,12),Person.Sex.MALE,"sam@yada.com")
        );
        class Age21 implements CheckPerson {

            @Override
            public boolean test(Person p){
                return p.getAge() >> 21;
            }
        }
        String output = captureOutput(() -> SocialNetwork.printPersons(roster, new Age21()));

        assertTrue(output.contains("Sam"));


    }
}

