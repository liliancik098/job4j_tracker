package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
       return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int siz = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(key)) {
                rsl[siz] = items[i];
                siz++;
            }
        }
        return Arrays.copyOf(rsl, siz);
    }

    public boolean replace(int id, Item item) {
        private int indexOf(int id) {
            int rsl = -1;
            for (int index = 0; index < size; index++) {
                if (items[index].getId() == id) {
                    rsl = index;
                    break;
                }
            }
            return rsl;
        }
    }

    public Item findById(int id) {
        /*Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;

         */
        //Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items[index] : null;
    }
}