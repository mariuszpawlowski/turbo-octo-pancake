package pl.kurs.zadania.zadanie19.domain;

import java.util.Comparator;

public class User /*implements Comparable<User> */{

    private String name;
    private String password;
    private Person personDetails;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Person getPersonDetails() {
        return personDetails;
    }

    public User setPersonDetails(Person personDetails) {
        this.personDetails = personDetails;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", personDetails=" + personDetails +
                '}';
    }



  /*  @Override
    public int compareTo(User o) {

        return o.getPersonDetails().getAge() - personDetails.getAge();

    }*/
}