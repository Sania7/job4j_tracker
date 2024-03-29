package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (var value : deps) {
            String start = "";
            for (var el : value.split("/")) {
                start = start.equals("") ? el : start + "/" + el;
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void  sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
