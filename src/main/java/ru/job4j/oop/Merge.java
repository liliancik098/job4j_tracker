package ru.job4j.oop;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int j = 0;
        int i = 0;
        int r = 0;
        int[] rsl = new int[left.length + right.length];
        while (r < rsl.length) {
            if (j < left.length && left[j] < right[i]) {
                rsl[r++] = left[j++];
            } else {
                rsl[r++] = right[i++];
            }
        }
        return rsl;
    }
}
