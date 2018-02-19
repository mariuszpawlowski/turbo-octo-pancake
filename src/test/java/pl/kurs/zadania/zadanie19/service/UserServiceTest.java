package pl.kurs.zadania.zadanie19.service;

import org.junit.Before;
import org.junit.Test;
import pl.kurs.zadania.zadanie19.domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService userService;
    private List<User> users;
    private Person person1;

    @Before
    public void before() {
        userService = new UserService();

        users = new ArrayList<>();
        User user1 = new User();

        Person person1 = new Person();


        Address address1 = new Address();
        Role role1 = new Role();
        Permission permission1 = new Permission();
        permission1.setName("permission1");

        User user2 = new User();
        Person person2 = new Person();
        Address address2 = new Address();
        Role role2 = new Role();
        Permission permission2 = new Permission();
        permission2.setName("apermission2");

        role1.setPermissions(Arrays.asList(permission1, permission2));
        person1.setRole(role1);

        //user1
        user1.setName("AJan");
        user1.setPassword("11");
        user1.setPersonDetails(person1);

        person1.setName("Jan");
        person1.setSurname("Kowalski");
        person1.setAge(30);

        List<String> phoneNumbers1 = new ArrayList<>();
        phoneNumbers1.add("666666666");
        phoneNumbers1.add("777777777");

        person1.setPhoneNumbers(phoneNumbers1);

        address1.setStreetName("Warszawska");
        address1.setCity("Gdynia");
        address1.setCountry("Polska");
        address1.setFlatNumber(7);
        address1.setHouseNumber(3);
        address1.setPostCode("81-370");

      //  permission1.setName("Jan");

        List<Address> adresy = new ArrayList<>();
        adresy.add(address1);
        adresy.add(address2);

        person1.setAddresses(adresy);

        person1.setAddresses(Arrays.asList(address1, address2));

       // user1.setPersonDetails(person1);

        //user2
        user2.setName("AJan");
        user2.setPassword("11");

        person2.setName("Jan");
        person2.setSurname("Kowalski");
        person2.setAge(20);

        List<String> phoneNumbers2 = new ArrayList<>();
        phoneNumbers2.add("666666666");
        phoneNumbers2.add("777777777");

        person2.setPhoneNumbers(phoneNumbers2);

        address2.setStreetName("Warszawska");
        address2.setCity("Gdynia");
        address2.setCountry("Polska");
        address2.setFlatNumber(7);
        address2.setHouseNumber(3);
        address2.setPostCode("81-370");

      //  permission2.setName("Jan");

        users.add(user1);
        users.add(user2);

        user2.setPersonDetails(person2);


    }

    @Test
    public void findOldestPerson_ShouldFindOldest() {
        // Given


        // When
        Person wynik = UserService.findOldestPerson(users);

        // Then
        assertThat(wynik).isEqualTo(person1);
        assertThat(wynik.getAge()).isEqualTo(30);

    }

    @Test
    public void getSortedPermissionsOfUsersWithNameStartingWithA_ShouldGetSortedPermissionsOfUsersWithNameStartingWithA() {
        // Given


        // When
        List<String> wynik = UserService.getSortedPermissionsOfUsersWithNameStartingWithA(users);

        // Then


    }


}