package ss1;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so A: ");

        int a = sc.nextInt();
        System.out.print("Nhap so B: ");
        int b = sc.nextInt();

        int max=(a>b)?a:b;
        System.out.println("So lon nhat: "+max);
    }
}
