package ss1;

import java.util.Scanner;

public class SalaryNv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tham nien cong tac: ");
        int n = sc.nextInt();
        double Salary = 650000;
        if (n < 12) {
            System.out.println("he so luong: " + (1.92 * Salary) + "$");
        } else if (n < 36) {
            System.out.println("he so luong: " + (2.34 * Salary) + "$");
        } else if (n < 60) {
            System.out.println("he so luong: " + (3 * Salary) + "$");
        } else {
            System.out.println("he so luong: " + (4.5 * Salary) + "$");
        }
    }
}
