package ru.job4j.stream;

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

   public static List<Address> sort(List<Profile> profile) {
       return profile.stream()
               .map(Profile::getAddress)
               .sorted()
               .distinct()
               .collect(Collectors.toList());

   }
}
