package ss1;

import java.util.Scanner;

public class ChagrChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 chu: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
                System.out.println("thuong: " + ch);
            } else {
                ch -= 32;
                System.out.println("hoa: " + ch);
            }
        } else {
            System.out.print("Nhap sai ");
        }

    }
}
