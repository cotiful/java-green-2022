package ex10;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void bubble_sort(int[] a) {
        bubble_sort(a, a.length);
    }

    private static void bubble_sort(int[] a, int size) {

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}