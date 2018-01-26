package pl.kurs.zadania.zadanie19;

import pl.kurs.zadania.zadanie19.domain.Person;
import pl.kurs.zadania.zadanie19.domain.User;
import pl.kurs.zadania.zadanie19.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {

    public static void main(String[] args) {


        List<User> users = new ArrayList<>();

        User user1 = new User();
        Person pd = new Person();
        user1.setPersonDetails(pd);


        List<User> przefiltrowanaLista = UserService.findUsersWhoHaveMoreThanOneAddress(users);
        System.out.println(przefiltrowanaLista);

    }
}
