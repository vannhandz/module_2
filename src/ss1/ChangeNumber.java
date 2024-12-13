package ss1;

import java.util.Scanner;

public class ChangeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so: ");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("bạn nhập: one");
                break;
            case 2:
                System.out.println("bạn nhập: two");
                break;
            case 3:
                System.out.println("bạn nhập: three");
                break;
            case 4:
                System.out.println("bạn nhập: four");
                break;
            case 5:
                System.out.println("bạn nhập: five");
                break;
            case 6:
                System.out.println("bạn nhập: six");
                break;
            case 7:
                System.out.println("bạn nhập: seven");
                break;
            case 8:
                System.out.println("bạn nhập: eight");
                break;
            case 9:
                System.out.println("bạn nhập: nine");
                break;
            case 10:
                System.out.println("bạn nhập: ten");
                break;


            default:
        }
    }
}
