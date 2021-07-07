package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProfilesTest {
    @Test
    public void address() {
        Address addressOne = new Address("Surgrt", "Krilova", 27, 233);
        Address addressTwo = new Address("Tomsk", "Uchebnaja", 54, 3);
        Address addressThree = new Address("Novosibirsk", "Frunze", 112, 122);
        Address addressThree1 = new Address("Novosibirsk", "Frunze", 112, 122);
        Address addressFour = new Address("Omsk", "Tverskaja", 45, 98);
        Address addressFive = new Address("Tumen", "Burovaja", 21, 115);
        Address addressFive1 = new Address("Tumen", "Burovaja", 21, 115);

        Profile profileOne = new Profile(addressOne);
        Profile profileTwo = new Profile(addressTwo);
        Profile profileThree = new Profile(addressThree);
        Profile profileFour = new Profile(addressFour);
        Profile profileFive = new Profile(addressFive);

        List<Profile> profiles =
                Arrays.asList(profileOne, profileTwo, profileThree, profileFour, profileFive);
        List<Address> rsl = Profiles.collect(profiles);

        List<Address> expected =
                Arrays.asList(addressOne, addressTwo, addressThree, addressFour, addressFive);
        assertEquals(rsl, expected);
    }
        @Test
        public void whenSort() {
            Address addressOne = new Address("Surgrt", "Krilova", 27, 233);
            Address addressTwo = new Address("Tomsk", "Uchebnaja", 54, 3);
            Address addressThree = new Address("Novosibirsk", "Frunze", 112, 122);
            Address addressThree1 = new Address("Novosibirsk", "Frunze", 112, 122);
            Address addressFour = new Address("Omsk", "Tverskaja", 45, 98);
            Address addressFive = new Address("Tumen", "Burovaja", 21, 115);
            Address addressFive1 = new Address("Tumen", "Burovaja", 21, 115);

            Profile profileOne = new Profile(addressOne);
            Profile profileTwo = new Profile(addressTwo);
            Profile profileThree = new Profile(addressThree);
            Profile profileThree1 = new Profile(addressThree1);
            Profile profileFour = new Profile(addressFour);
            Profile profileFive = new Profile(addressFive);
            Profile profileFive1 = new Profile(addressFive1);

            List<Profile> prof =
                    Arrays.asList
                            (profileOne, profileTwo, profileThree, profileThree1, profileFour, profileFive, profileFive1);
            List<Address> sort = Profiles.sort(prof);
            List<Address> expect = Arrays.asList(addressOne, addressTwo, addressThree, addressFour, addressFive);

            assertEquals(sort, expect);
        }
}