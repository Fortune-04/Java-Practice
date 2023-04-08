package DataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTry {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Yumi");
        names.add("Luna");
        names.add("Lily");
        names.add("Ayumi");
        names.add("Yukari");

        System.out.println(names);

        List<String> number = new ArrayList<>();
        number.add("One");
        number.add("Two");
        number.add("Three");
        number.add("One");
        number.add("Four");
        number.add("Two");

        System.out.println(number);

        Set<String> setNumber = new HashSet<>(number);
        System.out.println(setNumber);

    }
}
