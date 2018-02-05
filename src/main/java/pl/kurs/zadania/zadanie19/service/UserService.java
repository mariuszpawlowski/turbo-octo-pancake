package pl.kurs.zadania.zadanie19.service;

import pl.kurs.zadania.zadanie19.domain.Person;
import pl.kurs.zadania.zadanie19.domain.Role;
import pl.kurs.zadania.zadanie19.domain.User;

import java.util.*;

public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        List<User> listaOdfiltrowana = new ArrayList<>();
        for (User user : users) {
            if (user.getPersonDetails().getAddresses().size() > 1) {
                listaOdfiltrowana.add(user);
            }
        }

        return listaOdfiltrowana;
    }

    public static Person findOldestPerson(List<User> users) {
       // Comp comp = new Comp();

        User najstarszy = users.stream()
                .sorted((o1, o2) -> o2.getPersonDetails().getAge() - o1.getPersonDetails().getAge())
                .findFirst()
                .orElseThrow( () -> new IllegalArgumentException("Wrong input data") );

        return najstarszy.getPersonDetails();

    }

    public static User findUserWithLongestUsername(List<User> users) {

        User longestName = new User();
        longestName = users.get(0);

        for (int i = 1; i < users.size(); i++) {
            if (longestName.getName().toString().length() > users.get(i).getName().toString().length()) {
                longestName = users.get(i);
            }
        }

        return longestName;
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {

        String above18 = "";

            for (User user : users) {
                if (user.getPersonDetails().getAge() > 18) {
                    above18 = user.getPersonDetails().getName().toString() + "," + user.getPersonDetails().getSurname().toString() +"\n";
                }
            }

        return above18;
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {

        List <String> permissions = new ArrayList<>();

        for (User user : users) {
            if (user.getName().toString().startsWith("A")) {
                permissions.add(user.getName().toString()+" "+ user.getPersonDetails().getRole().getPermissions().toString());
            }
        }
        return permissions;
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
        List <String> permissions = new ArrayList<>();

        for (User user : users) {
            if (user.getName().toString().startsWith("S")) {
                permissions.add(user.getName().toString()+" "+ user.getPersonDetails().getRole().getPermissions().toString().toUpperCase());
            }
        }

        System.out.println(permissions);
    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {

        Map<Role, List<User>> usersRole = new TreeMap<>();


        for (User user: users){

            usersRole.put(user.getPersonDetails().getRole(), users);
        }

        return usersRole;
    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {

        Map<Boolean, List<User>> partitionUser = new TreeMap<>();


        for (User user: users) {
            if (user.getPersonDetails().getAge() != 18) {
                partitionUser.put(true, users);
            }
        }
        return partitionUser;
    }
}