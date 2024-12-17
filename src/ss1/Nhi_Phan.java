package ss1;

import java.util.Scanner;

public class Nhi_Phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        String check= "";
        for (int i = 0; n>0; i++) {
            check=n%2 + check;
            n/=2;
        }
        System.out.print(check);
    }
}
