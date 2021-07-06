package ru.job4j.stream;

public class Profile {
    private Address address; // переменная содержит доступ к классу Address

    public Profile(Address address) { // создаем конструктор
        this.address = address;
    }

    public Address getAddress() { // делаем доступ к переменной
        return address;
    }
}
