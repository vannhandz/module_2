package ss1;

import java.util.Scanner;

public class Out_Chan_2n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
                System.out.print(i*2+" ");
        }
    }
}