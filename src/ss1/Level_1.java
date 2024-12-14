package ss1;

import java.util.Scanner;

public class Level_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("nhap a: ");
        double a = sc.nextInt();
        System.out.print("nhap b: ");
        double b = sc.nextInt();
        if (a != 0) {
            if (b == 0) {
                System.out.println("vo so nghiem");
            } else {
                System.out.println("x = " + (b / a));
            }
        } else {
            System.out.println("vo nghiem");
        }
    }
}
