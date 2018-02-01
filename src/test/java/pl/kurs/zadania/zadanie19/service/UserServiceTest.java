package pl.kurs.zadania.zadanie19.service;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.zadania.zadanie19.domain.Address;
import pl.kurs.zadania.zadanie19.domain.Person;
import pl.kurs.zadania.zadanie19.domain.User;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void before(){
        userService = new UserService();
    }

    @Test
    public void findOldestPerson_ShouldFindOldest(){
        // Given
        List <User> users= new ArrayList<>();
        User user1 = new User();
        Person person1 = new Person();

        user1.setName("Janek");
        user1.setPassword("11");

        person1.setName("Jan");
        person1.setSurname("Kowalski");

        List <String> phoneNumbers1 = new ArrayList<>();
        phoneNumbers1.add("666666666");
        phoneNumbers1.add("777777777");

        person1.setPhoneNumbers(phoneNumbers1);
        List<Address> address1 = new ArrayList<>();
        address1.add("Morska", 10, 5, "Gdynia","80-100", "Poland" );

        person1.setAge(30);
        users.add(user1);

        // When
        Person wynik = UserService.findOldestPerson(users);
        // Then

        assertThat(wynik).isEqualTo(user1);

    }

}