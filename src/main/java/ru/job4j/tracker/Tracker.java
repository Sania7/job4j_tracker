package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    /* Массив для хранения заявок.*/
    private final Item[] items = new Item[100];

    /* поле ids используется для генерации нового ключа
    каждый вызов метод add будет добавлять в поле ids единицу
     */
    private int ids = 1;

    /* поле размер нового массива*/
    private int size = 0;


    /* добавляет заявку, переданную в аргументах в массив заявок items.*/
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /* метод проверяет в цикле все элементы все элементы массива items, сравнивая id с аргументом int id */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /* проверяет в цикле все элементы массива items, сравнивая name(используя метод getName класса Item) c аргументом метода String key */
    public Item[] findByName(String key) {
        Item[] copyItems = new Item[size];
        int copySize = 0;
        for (int index = 0; index < size; index++) {
            Item item = this.items[index];
            if (item.getName().equals(key)) {
                copyItems[copySize++] = item;
            }
        }
        return Arrays.copyOf(copyItems, copySize);
    }

    /* метод public Item[] findAll() возвращает копию массива items без null элементов (без пустых ячеек). */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }


    private int indexOf(int id) {
        int rsl = - 1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
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
           items[index] = item;
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
            items[size - 1] = null;
            size--;
            return true;
        }
        return rsl;
    }
}