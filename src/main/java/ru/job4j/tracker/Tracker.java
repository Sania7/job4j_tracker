package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {

    private final List<Item> items = new ArrayList<>();

    /* поле ids используется для генерации нового ключа
    каждый вызов метод add будет добавлять в поле ids единицу
     */
    private int ids = 1;



    /* добавляет заявку, переданную в аргументах в массив заявок items.*/
    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    /* метод проверяет в цикле все элементы все элементы массива items, сравнивая id с аргументом int id */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /* проверяет в цикле все элементы  items, сравнивая name(используя метод getName класса Item) c аргументом метода String key */
    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    /* метод public Item[] findAll() возвращает копию массива items без null элементов (без пустых ячеек). */
    public List<Item> findAll() {
        return items;
    }


    private int indexOf(int id) {
        int rsl = - 1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /* Метод замены заявки. Tracker.replace */
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
       boolean rsl = index != -1;
       if (rsl) {
           items.set(index, item);
           item.setId(id);
       }
        return rsl;
    }

    /* Метод удаления заявки Tracker.delete */
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
}