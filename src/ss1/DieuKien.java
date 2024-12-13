package ss1;

import java.util.Scanner;

public class DieuKien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();
        int count=0;
        int distance=1;

        for (int i = 2; i <= x; i+=2) {

           if(count==distance){
               System.out.print(-i+" ");
               count=0;
               distance++;
           }else
           {
               System.out.print(i+" ");
               count++;
           }

        }




//        int x = sc.nextInt();
//        for (int i = 1; i <= x; i+=2) {
//                System.out.print(i + " ");
//        }


//        int x = sc.nextInt();
//        for (int i = 1; i <=x; i++) {
//            System.out.print(i+" ");
//        }


//        System.out.print("nhap a: ");
//        double a = sc.nextInt();
//        System.out.print("nhap b: ");
//        double b = sc.nextInt();
//        if (a != 0) {
//            if (b == 0) {
//                System.out.println("vo so nghiem");
//            } else {
//                System.out.println("x = " + (b / a));
//            }
//        } else {
//            System.out.println("vo nghiem");
//        }


//        System.out.print("nhap so: ");
//        int x = sc.nextInt();
//
//        switch (x) {
//            case 1:
//                System.out.println("bạn nhập: one");
//                break;
//            case 2:
//                System.out.println("bạn nhập: two");
//                break;
//            case 3:
//                System.out.println("bạn nhập: three");
//                break;
//            case 4:
//                System.out.println("bạn nhập: four");
//                break;
//            case 5:
//                System.out.println("bạn nhập: five");
//                break;
//            case 6:
//                System.out.println("bạn nhập: six");
//                break;
//            case 7:
//                System.out.println("bạn nhập: seven");
//                break;
//            case 8:
//                System.out.println("bạn nhập: eight");
//                break;
//            case 9:
//                System.out.println("bạn nhập: nine");
//                break;
//            case 10:
//                System.out.println("bạn nhập: ten");
//                break;
//
//
//            default:
//        }

    }
}
