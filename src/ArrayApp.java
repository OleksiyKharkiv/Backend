public class ArrayApp {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[10];
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 51;
        arr[5] = 32;
        arr[6] = 16;
        arr[7] = 17;
        arr[8] = 18;
        int searchKey = 51;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == searchKey) {
                break;
            }
        }
        if (i == arr.length) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found at: " + i);
        }

    }
}
