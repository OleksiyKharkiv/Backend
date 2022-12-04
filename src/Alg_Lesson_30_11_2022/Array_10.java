package Alg_Lesson_30_11_2022;
import java.util.Arrays;
public class Array_10 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println(Arrays.toString(arr));

        insertFirstElement(arr, 10);
        insertFirstElement(arr, 9);
        insertFirstElement(arr, 8);
        insertFirstElement(arr, 7);
        insertFirstElement(arr, 6);
        insertFirstElement(arr, 5);
        insertFirstElement(arr, 4);
        insertFirstElement(arr, 3);
        insertFirstElement(arr, 2);
        insertFirstElement(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertFirstElement(int[] arr, int e)  {

        int arr0, temp;
        arr0 = arr[0];
        for (int i =1; i <arr.length ; i++) {
            temp = arr[i];
            arr[i] = arr0;
            arr0 = temp;

        }
            arr[0] = e;

//        for (int i = arr.length-1; i >=1 ; i--) {
//            arr[i] = arr[i-1];
//
//        }
//        arr[0] = e;


//
//            int[] arr2= new int[];
//        for (int i =1; i < arr.length; i++) {
//            arr2[i]=arr[i-1];
//                    }
//        arr2[0]=e;
//        for (int i =0; i < arr.length; i++) {
//            arr[i]=arr2[i];
//        }
        /*
         *TODO:
         * Создать массив на 10 элементов,
         * Написать метод, который вставляет переданное значение на 0 позицию в переданный массив
         * Вызвать этот метод 10 раз
         */
    }
}

