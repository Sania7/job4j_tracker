package ru.job4j.ooa;

public class Airbus  {
    private static int COUNT_ENGINE = 2;
    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }
    public void printCountEngine() {
        COUNT_ENGINE = 4;
        System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
    }

    @Override
    public String toString() {
        return "Airbus { " +
                "name = '" + name + '\'' +
                '}';
    }
}
