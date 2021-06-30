package ru.job4j.lambda;

public interface MyNumber {
    double getValue();
}

class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum = () -> 123.45;
        System.out.println("Фиксированное значение: " + myNum.getValue());
        //более сложное выражение
        myNum = () -> Math.random() * 100;
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Еще одно случайное выражение: " + myNum.getValue());

    }
}
