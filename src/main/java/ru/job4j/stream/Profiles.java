package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Метод запускает поток Map
 */
public class Profiles {
   public static List<Address> collect(List<Profile> profiles) {
       return profiles.stream()
               .map(Profile::getAddress)
               .collect(Collectors.toList());
   }

    public List<Address> sort(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());

    }
}
