package ss1;

import java.util.Scanner;

public class ChangePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap so A: ");
        a = sc.nextInt();
        System.out.print("Nhap so B: ");
        b = sc.nextInt();

//        int check=a;
//        a=b;
//        b=check;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("So A: " + a);
        System.out.println("So B: " + b);

    }
}
