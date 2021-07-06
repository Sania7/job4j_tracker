package ru.job4j.stream;

import org.junit.Test;

public class ProfilesTest {
    @Test
    public void address() {
        Address addressOne = new Address("Surgrt", "Krilova", 27, 233);
        Address addressTwo = new Address("Tomsk", "Uchebnaja", 54, 3);
        Address addressThree = new Address("Novosibirsk", "Frunze", 112, 122);
        Address addressFour = new Address("Omsk", "Tverskaja", 45, 98);
        Address addressFive = new Address("Tumen", "Burovaja", 21, 115);
    }
}