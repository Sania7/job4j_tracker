package ru.job4j.stream;

public class Car {
    private String name;
    private String type;
    private String bodyType;
    private String color;
    private double engineVolume;
    private double weight;
    private double power;

    @Override
    public String toString() {
        return "Car{"
                + "name='"
                + name
                + '\''
                + ", type='"
                + type
                + '\''
                + ", bodyType='"
                + bodyType
                + '\''
                + ", color='"
                + color
                + '\''
                + ", engineVolume="
                + engineVolume
                + ", weight="
                + weight
                + ", power="
                + power
                + '}';
    }

    static class Builder {
        private String name;
        private String type;
        private String bodyType;
        private String color;
        private double engineVolume;
        private double weight;
        private double power;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder builType(String type) {
            this.type = type;
            return this;
        }

        Builder buildBodyType(String bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        Builder buildWeight(double weight) {
            this.weight = weight;
            return this;
        }

        Builder builderPower(double power) {
            this.power = power;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.name = name;
            car.type = type;
            car.bodyType = bodyType;
            car.color = color;
            car.engineVolume = engineVolume;
            car.weight = weight;
            car.power = power;
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildName("name")
                .builType("type")
                .buildBodyType("bodytype")
                .buildColor("color")
                .buildEngineVolume(1400.0)
                .buildWeight(1234.500)
                .builderPower(125.5)
                .build();
        System.out.println(car);
    }
}