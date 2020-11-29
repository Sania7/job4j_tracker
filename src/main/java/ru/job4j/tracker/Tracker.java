package ru.job4j.tracker;

import java.util.ArrayList;

public class Tracker {
    /* Массив для хранения заявок.*/
    private final ArrayList<Item> items = new ArrayList<>();

    /* поле ids используется для генерации нового ключа
    каждый вызов метод add будет добавлять в поле ids единицу
     */
    private int ids = 1;

    /* поле размер нового массива*/
    private int size = 0;


    /* добавляет заявку, переданную в аргументах в массив заявок items.*/
    public Item add(Item item) {
        item.setId(ids++);
        items.add(this.size++, item);
        return item;
    }

    /* метод проверяет в цикле все элементы все элементы массива items, сравнивая id с аргументом int id */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /* проверяет в цикле все элементы массива items, сравнивая name(используя метод getName класса Item) c аргументом метода String key */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> rsl = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            Item item = this.items.get(index);
            if (item.getName().equals(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    /* метод public Item[] findAll() возвращает копию массива items без null элементов (без пустых ячеек). */
    public ArrayList<Item> findAll() {
        return items;
    }


    private int indexOf(int id) {
        int rsl = - 1;
        for (int index = 0; index < size; index++) {
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
            int start = index + 1;
            int distPos = index;
            int length = size - index;
            System.arraycopy(items, start, items, distPos, length);
            items.set(size - 1, null);
            size--;
            return true;
        }
        return rsl;
    }
}