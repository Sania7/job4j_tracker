package ru.job4j.lambda;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
    @Test
    public void whenFidByAddress() {
        PhoneDictionary address = new PhoneDictionary();
        address.add(
                new Person("Alexandr", "Bannikov", "477721", "Surgut")
        );
        ArrayList<Person> persons = address.find("Surgut");
        assertThat(persons.get(0).getAddress(), is("Surgut"));
    }
    @Test
    public void whenFindByNull() {
        PhoneDictionary thereIsNothing = new PhoneDictionary();
        thereIsNothing.add(new Person("", "", "", ""));
        ArrayList<Person> persons = thereIsNothing.find(" ");
        assertTrue( persons.isEmpty());
    }
}