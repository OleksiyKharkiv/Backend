package DZ_20_10_2022;

public class SumArr {
    int [] array = {3,12,10,11};
    public static void main(String[] args) {

               int [] array = {3,12,10,11};
        int n = 0;
        System.out.println(sum(n,array));
    }
    public static int sum(int n, int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }

        System.out.println("Sum=" + summa);
        return summa;
    }

}
