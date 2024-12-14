package ss1;

import java.util.Scanner;

public class Level_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
        double a = sc.nextDouble();
        System.out.print("Nhap B: ");
        double b = sc.nextDouble();
        System.out.print("Nhap C: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;


        if (a == 0) {
            if (b != 0) {
                if (c == 0) {
                    System.out.println("Vo so nghiem");
                } else {
                    System.out.println("x = " + (-c / b));
                }
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            if (delta < 0) {
                System.out.println("Vo nghiem");
            } else if (delta == 0) {
                System.out.println("x = " + (-b / (2 * a)));
            } else {
                System.out.println("x1 = " + (-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = " + (-b + Math.sqrt(delta)) / (2 * a));
            }
        }
    }
}
