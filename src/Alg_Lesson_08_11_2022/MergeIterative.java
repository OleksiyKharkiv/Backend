package Alg_Lesson_08_11_2022;

import java.util.Arrays;

public class MergeIterative {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 87, 1, 0, 52, 42, 41, 1, 5, 7};

        mergeSortIterative(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    //public class BinarySearch {
//    public static void main(String[] args) {
//        int[] arr = new int[] {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
//        int val = 190;
//        int i= arr.length/2;
//        int res;
//        while (arr[i]!=val) {
//            if ((arr[i]) < val) {
//                i = (arr.length + i) / 2;
//            }
//            if (arr[i] > val) {
//                i = i/2;
//            }
//        }
//        res= i;
//        System.out.println("index val="+res);
//
//    }
//}
    static void mergeSortIterative(int[] arr, int left, int right) {
        int l = arr.length / 2;
        left=0;
        right= arr.length-1;
        int middle = (left + right) / 2;
        int ind1 = middle - left + 1;
        int ind2 = right - middle;

        int[] arrL = new int[ind1];
        int[] arrR = new int[ind2];
        while (l / 2 != 1) {
            for (int i = 0; i < ind1; i++) {
                arrL[i] = arr[i + left];
            }

            for (int i = 0; i < ind2; i++) {
                arrR[i] = arr[middle + 1 + i];
            }

        }
    }


//    static void mergeSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int middle = (left + right) / 2;
//
//            mergeSort(arr, left, middle);
//            mergeSort(arr, middle + 1, right);
//
//            merge(arr, left, middle, right);
//        }
//    }

    static void merge(int[] arr, int left, int middle, int right) {
        int ind1 = middle - left + 1;
        int ind2 = right - middle;

        int[] arrL = new int[ind1];
        int[] arrR = new int[ind2];

        for (int i = 0; i < ind1; i++) {
            arrL[i] = arr[i + left];
        }

        for (int i = 0; i < ind2; i++) {
            arrR[i] = arr[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Сортируем 2 массива между собой
        while (i < ind1 && j < ind2) {
            if (arrL[i] <= arrR[j]) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }

            k++;
        }

        // Копируем оставшиеся элементы из arrL, если они есть
        while (i < ind1) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы из arrR, если они есть
        while (j < ind2) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }
}

