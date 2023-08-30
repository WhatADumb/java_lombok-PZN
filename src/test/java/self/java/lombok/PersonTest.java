package self.java.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    @Test
    void testViaConstructor() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Video Games");
        hobbies.add("Studying");
        hobbies.add("Reading");

        Person person = new Person(1, "Alpha", 17, hobbies);
        System.out.println(person);
    }

    @Test
    void testViaSetter() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Video Games");
        hobbies.add("Studying");
        hobbies.add("Reading");

        Person person = new Person();
        person.setId(1);
        person.setName("Alpha");
        person.setAge(17);
        person.setHobbies(hobbies);

        System.out.println(person);
    }

    @Test
    void testViaBuilder() {
        Person.PersonBuilder personBuilder = new Person.PersonBuilder()
                .id(1).name("Alpha").age(17).hobby("Studying")
                .hobbies(List.of("Reading", "Gaming"));

        Person person = personBuilder.build();

        System.out.println(person);
    }
}
