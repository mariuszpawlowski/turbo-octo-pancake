package pl.kurs.zadania.zadanie19.service;

import pl.kurs.zadania.zadanie19.domain.Person;
import pl.kurs.zadania.zadanie19.domain.Role;
import pl.kurs.zadania.zadanie19.domain.User;

import java.util.*;
import java.util.stream.Collectors;

public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {

        return users.stream()
                .filter(x -> x.getPersonDetails().getAddresses().size() > 1)
                .collect(Collectors.toList());
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

    // https://stackoverflow.com/questions/27534684/good-method-to-call-method-on-each-object-using-stream-api
    // System.out.println w streamach
    // wolanie metod statycznych
    // ::
    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
        List <String> permissions = new ArrayList<>();

        for (User user : users) {
            if (user.getName().toString().startsWith("S")) {
                permissions.add(user.getName().toString()+" "+ user.getPersonDetails().getRole().getPermissions().toString().toUpperCase());
            }
        }

        System.out.println(permissions);
    }

    //https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwiMw9q1pY_ZAhXJJlAKHZQ9A7oQFggnMAA&url=https%3A%2F%2Fstackoverflow.com%2Fq%2F20363719&usg=AOvVaw06UHeJo0Mn6k790fAONUGk
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