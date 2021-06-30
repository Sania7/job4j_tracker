package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    /**
     * Фильтры созданы с использованием встроенного функционального интерфейса Predicate
     * для фильтрации объектов по соответствию параметра size заданному условию.
     */
    private Predicate<Folder> filterBySize = (i) -> i.getSize() > 100;
    private Predicate<Folder> filterByName = (s) -> s.getName().contains("bug");

    /**
     *
     * @param list определяет список объектов
     * @param pred вид фильтра по которому будет осуществляться сортировка
     * @return список отсортированных объектав Folder
     */

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f : list) {
            if (pred.test(f)) {
                rsl.add(f);
            }
        }
        return rsl;
    }
}
