package Alg_Lesson_30_11_2022;

import java.util.Arrays;

public class DynamicArray {
    int[] arr = new int[0];

    public void add(int e) {
        // При добавлении каждого элемента увеличить размер массива на 1
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length - 1] = e;
        arr = arr2;


    }


    public void remove() {
        // При удалении каждого элемента уменьшить размер массива на 1
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public int size() {
        return arr.length;
    }
}
