package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        for (int i = 0; i < (Math.min(o1.length(), o2.length())); i++) {
            int compare = Character.compare(o1.charAt(i), o2.charAt(i));
            if (o1.length() < o2.length() && i == o1.length() - 1 && compare == 0) {
                return -1;
            } else if (o2.length() < o1.length() && i == o2.length() - 1 && compare == 0) {
                return 1;
            }
            if (compare == 0) {
                continue;
            }
            return compare;
        }
        return 0;
    }
//    public int compare(String left, String right) {
//        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
//            char ch1 = left.charAt(i);
//            char ch2 = right.charAt(i);
//            if (ch1 != ch2) {
//                return ch1 - ch2;
//            }
//        }
//        return left.length() - right.length();
//    }
}
