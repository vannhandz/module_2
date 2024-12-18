package ss1;

import java.util.Scanner;

public class Sum_3_Giaithua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        System.out.print("Nhap B: ");
        int c = sc.nextInt();
        int sum = 0;
        int max = 0;
        if (a >= b && a >= c) max = a;
        else if (b >= a && b >= c) max = b;
        else if (c >= a && c >= b) max = c;
        int sumA = 1, sumB = 1, sumC = 1;
        for (int i = 1; i <= max; i++) {
            if (i <= a) {
                sumA *= i;
            }
            if (i <= b) {
                sumB *= i;
            }
            if (i <= c) {
                sumC *= i;
            }
        }
        System.out.println("Tong: " + (sum = sumA + sumB + sumC));
    }
}
