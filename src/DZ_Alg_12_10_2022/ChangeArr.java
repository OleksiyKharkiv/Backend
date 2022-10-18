package DZ_Alg_12_10_2022;

public class ChangeArr {
    int i, num;

    public ChangeArr(int i, int num) {
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //    До вставки:
//[25,14,56,15,47]
//После вставки:
//[25,14,5,56,15]
    public void changeArr(int i, int num) {

        int[] arr = new int[]{25, 14, 56, 15, 47};
        System.out.println("Array before:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" " + arr[j]);
        }

        System.out.println("Array changed:");
        arr[i] = num;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" " + arr[j]);
        }
    }
}



