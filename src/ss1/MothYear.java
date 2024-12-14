package ss1;

import java.util.Scanner;

public class MothYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("so ngay la: 30");
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("so ngay la: 29");
            } else {
                System.out.println("so ngay la: 28");
            }
        } else {
            System.out.println("so ngay la: 31");
        }

    }
}
