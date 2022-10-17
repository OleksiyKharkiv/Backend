public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= { 1,4, -4, 23, 14, 32,34};
        System.out.println(searchLinear(arr, 14));
    }
    public static int searchLinear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
