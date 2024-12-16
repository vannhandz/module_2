package ss1;

import java.util.Scanner;

public class TamGIac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        //        hinh 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j < i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //        hinh 2
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j < i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //        hinh 3
        for (int i =1; i <=n; i++) {
            for (int j = n; j >=1; j--) {
                if (i == j || j<i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //        hinh 4
        for (int i =n; i >=1; i--) {
            for (int j = n; j >=1; j--) {
                if (i == j || j<i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
