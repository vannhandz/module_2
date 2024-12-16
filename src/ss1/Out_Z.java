package ss1;

import java.util.Scanner;

public class Out_Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        // hinh 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i==1 ||  i==n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // hinh 2
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=1; j--) {
                if (i == j || i==1 ||  i==n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
