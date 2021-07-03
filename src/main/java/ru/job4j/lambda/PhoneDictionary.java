package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }
//    public ArrayList<Person> find(String key) {
//        Predicate<Person> predicate =
//        ArrayList<Person> result = new ArrayList<>();
//        for (Person p : persons) {
//            if (combine.test(per)) {
//
//            }
//        }
//        return result;
//    }
}
