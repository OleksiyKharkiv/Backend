public class ArrayApp {
    public static void main(String[] args) {
        double[] arr;
        arr = new double[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

//        int searchKey = 51;
        int i, j, k;
        double sumArr = 0;
        double mean = 0;
        int max, min;
//        for (i = 0; i < arr.length; i++) {
//            if (arr[i] == searchKey) {
//                break;
//            }
//        }
//        if (i == arr.length) {
//            System.out.println("Can't find " + searchKey);
//        } else {
//            System.out.println("Found at: " + i);
//        }
        for (j = 0; j < arr.length; j++) {
            sumArr = sumArr + arr[j];
        }
        System.out.println("Summ= " + sumArr);
        mean = sumArr/ (arr.length);
        System.out.println("Mean=" + mean);
        System.out.println("AL=" + arr.length);


    }
}
