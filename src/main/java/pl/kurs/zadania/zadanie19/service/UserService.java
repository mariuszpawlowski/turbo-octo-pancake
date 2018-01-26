package pl.kurs.zadania.zadanie19.service;

import pl.kurs.zadania.zadanie19.domain.Person;
import pl.kurs.zadania.zadanie19.domain.Role;
import pl.kurs.zadania.zadanie19.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        List<User> listaOdfiltrowana = new ArrayList<>();
        for (User user : users){
            if (user.getPersonDetails().getAddresses().size() > 1){
                listaOdfiltrowana.add(user);
            }
        }

        return listaOdfiltrowana;
    }

    public static Person findOldestPerson(List<User> users) {

        return null;
    }

    public static User findUserWithLongestUsername(List<User> users) {

        return null;
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {

        return null;
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {

        return null;
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {


    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {

        return null;
    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {

        return null;
    }
}