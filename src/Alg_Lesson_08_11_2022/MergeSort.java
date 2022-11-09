package Alg_Lesson_08_11_2022;

public class MergeSort {


    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 87, 1, 0, 52, 42, 41, 1, 5, 7};

        mergeSort(arr, 0, arr.length - 1);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    static void merge(int[] arr, int left, int middle, int right) {
        int ind1 = middle - left + 1;
        int ind2 = right - middle;

        int[] arrL = new int[ind1];
        int[] arrR = new int[ind2];

        for (int i = 0; i < ind1; i++) {
            arrL[i] = arr[i + 1];
        }

        for (int i = 0; i < ind2; i++) {
            arrR[i] = arr[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = 0;
        int[] arrRes = new int[];
        // Сортируем 2 массива между собой
        while (i < ind1 && j < ind2) {

            for (k = 0; k < ind1 + ind2; k++) {
                if (arrL[i] < arrR[j]) {
                    arrRes[k] = arrL[i];
                } else {
                    arrRes[k] = arrR[j];
                }
            }
        }

        // Копируем оставшиеся элементы из arrL, если они есть
        while (i < ind1) {
            if (ind1>ind2) {
                for (k = (ind1+ind2)-(ind1-ind2); k <(ind1+ind2) ; k++) {
                    arrRes[k]=arrL[ind1-ind2+i];
                }
            }
        }

        // Копируем оставшиеся элементы из arrR, если они есть
        while (j < ind2) {
            if (ind2>ind1) {
                for (k = (ind1+ind2)-(ind2-ind1); k <(ind1+ind2) ; k++) {
                    arrRes[k]=arrR[ind2-ind1+i];
                }
            }
        }
    }
}

