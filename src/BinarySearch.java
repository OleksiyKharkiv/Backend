public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        int val = 114;
        int i= arr.length/2;
        int res;
        while (arr[i]!=val) {
            if ((arr[i]) < val) {
                i = (arr.length + i) / 2;
            }
            if (arr[i] > val) {
                i = i/2;
            }

        }
        res= i;
        System.out.println("index val="+res);

    }
}
