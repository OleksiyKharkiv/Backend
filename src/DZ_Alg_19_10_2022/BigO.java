package DZ_Alg_19_10_2022;

public class BigO {
//    First level: вычислить сложность в лучшем и худшем случае


//1. Сomplexity = O(1)
    void method(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }


//2. Complexity=O(Math.pow(n, 3);
    void method(int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 1; j + n / 2 <= n; j++) {
                for (int k = 1; k <= n; k = k * 2) {
                    System.out.println("I am expert!");
                }
            }
        }
    }


//3. Complexity=O(Math.pow(n, 2);
    void method3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j = j + i) {
                System.out.println("I am expert!");
            }
        }
    }



}
