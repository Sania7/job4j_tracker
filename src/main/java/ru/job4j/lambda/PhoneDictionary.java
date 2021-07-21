package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;
//2. Local-Variable Type Inference [#70626]

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> filterByName = (s) -> s.getName().contains(key);
        Predicate<Person> filterBySurname = (s) -> s.getSurname().contains(key);
        Predicate<Person> filterByPhone = (s) -> s.getPhone().contains(key);
        Predicate<Person> filterByAddres = (s) -> s.getAddress().contains(key);
        Predicate<Person> combine = filterByName.or(filterBySurname)
                .or(filterByPhone).or(filterByAddres);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
