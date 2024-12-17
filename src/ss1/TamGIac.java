package ss1;

import java.util.Scanner;

public class TamGIac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        //        hinh a
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ( j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //        hinh b
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= n; j++) {
                if ( j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //        hinh c
        for (int i =1; i <=n; i++) {
            for (int j = n; j >=1; j--) {
                if (j<=i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //        hinh d
        for (int i =n; i >=1; i--) {
            for (int j = n; j >=1; j--) {
                if ( j<=i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //        hinh e
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j ==1||i==n ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //        hinh f
        for (int i =1; i <=n; i++) {
            for (int j = n; j >=1; j--) {
                if (j<=i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //        hinh g
        for (int i =n; i >=1; i--) {
            for (int j = n; j >=1; j--) {
                if ( j<=i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
