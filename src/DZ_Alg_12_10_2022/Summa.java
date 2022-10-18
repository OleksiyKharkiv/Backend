package DZ_Alg_12_10_2022;

public class Summa {

        int num1, num2, num3;
        int sum;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Summa(int num1, int num2, int num3) {
        this.sum = sum;
        sum=num1+num2+num3;
    }
    @Override
    public String toString() {
        return
                "Sum=" + sum;
    }
    //        num1=1;
//        num2=2;
//        num3=3;
//        sum = num1+num2+num3;
//        System.out.println("Sum=" + sum);


}
