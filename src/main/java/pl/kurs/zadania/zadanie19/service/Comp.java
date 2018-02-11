package pl.kurs.zadania.zadanie19.service;

import pl.kurs.zadania.zadanie19.domain.User;

import java.util.Comparator;

public class Comp implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o2.getPersonDetails().getAge() - o1.getPersonDetails().getAge();
    }
}
