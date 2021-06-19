package ru.job4j.ooa;

public final class Airbus {
    private static final int COUNT_ENGINE = 2;
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
        System.out.println("Модель самолета " + name);
    }

    public void printCountEngine() {
        int countEngine = 4;
        System.out.println("Количество двигателей равно: " + countEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='"
                + name
                + '\''
                +
                '}';
    }
}
