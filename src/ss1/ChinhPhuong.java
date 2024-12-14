package ss1;

import java.util.Scanner;

public class ChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHap so: ");
        int n = sc.nextInt();
        if (n%Math.sqrt(n)==0) {
            System.out.println(n+" la chinh phuong");
        }else
        {
            System.out.println(n+" khong la chinh phuong");
        }
    }
}
