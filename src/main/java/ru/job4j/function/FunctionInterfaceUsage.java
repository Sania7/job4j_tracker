package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage { //Supplier (поставщик)
    public static void main(String[] args) {

        Supplier<String> sup = () -> "New String For Interface.";
        //создаем строку и выводим ее в консоль
        System.out.println(sup.get());
        System.out.println();

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        //HashSet строк из списка с помощью
        // этого интерфейса
        Supplier<Set<String>> supp = () -> new HashSet<>(list);
        Set<String> strings = supp.get();
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println();

        Supplier<String> sup1 = () -> "New String For Interface Consumer.";
        // Consumer and BiConsumer (потребитель)
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept(sup1.get());
        System.out.println();

        Supplier<String> sup2 = () -> "New String For Interface";
        // пример на применение BiConsumer:
        BiConsumer<String, String> consumer1 = (s, s1) -> System.out.println(s + s1);
        consumer1.accept(sup2.get(), " and Second String");
        System.out.println();

        List<String> list1 = List.of("one", "two", "three", "one", "two", "three");
        // параметры в Biconsumer могут
        // быть разных типов
        Supplier<Set<String>> sup3 = () -> new HashSet<>(list1);
        BiConsumer<Integer, String> consumer2 = (s, s1) -> System.out.println(s + s1);
        Set<String> strings1 = sup3.get();
        int i = 1;
        for (String s : strings1) {
            consumer2.accept(i++, " is " + s);
        }
        System.out.println();

        Predicate<String> pred = s -> s.isEmpty(); // Predicate(BiPredicate)
        System.out.println("Строка пустая: " + pred.test(""));
        System.out.println("Строка пустая: " + pred.test("test"));
        System.out.println();

        BiPredicate<String, Integer> cond = (s, a) -> s.contains(a.toString());
        // С двумя параметрами
        System.out.println("Строка содержит подстроку: " + cond.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + cond.test("Name", 123));
        System.out.println();
/*  4. Function (BiFunction).
//в обобщенных типах мы должны указать 2 параметра – вторым
параметром мы указываем тип возвращаемого значения (в нашем случае это Character).*/
        Function<String, Character> func = s -> s.charAt(2);
        System.out.println("Третий символи в строке: " + func.apply("first"));
        System.out.println("Третий символ в строке: " + func.apply("second"));
        System.out.println();

        BiFunction<String, Integer, String> biFunc = (s, k) -> s.concat(" ").concat(k.toString());
        // Bi-формы функционального
        // интерфейса
        System.out.println("Результат работы функции: " + biFunc.apply("Name", 123));
        System.out.println("Результат работы функции: " + biFunc.apply("String number", 12345));
        System.out.println();

        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        // 5. UnaryOperator и BinaryOperator.
        System.out.println("Строка после реверса: "
                + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: "
                + builder.apply(new StringBuilder("tset rof gnirtS")));
    }
}