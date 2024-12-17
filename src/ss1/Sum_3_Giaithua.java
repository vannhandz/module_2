package ss1;

import java.util.Scanner;

public class Sum_3_Giaithua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        System.out.print("Nhap B: ");
        int c = sc.nextInt();
        int sum=0;
        int sumA=1, sumB=1,sumC=1;
        for (int i = 1; i <=a; i++) {
           sumA*=i;
        }
        for (int i = 1; i <=b; i++) {
            sumB*=i;
        }
        for (int i = 1; i <=c; i++) {
            sumC*=i;
        }
        System.out.println("Tong: "+ (sum=sumA+sumB+sumC));
    }
}
