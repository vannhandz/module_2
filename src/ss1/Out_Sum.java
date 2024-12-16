package ss1;

import java.util.Scanner;

public class Out_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+= 1f /i;
        }
        System.out.println((sum) +" ");
    }
}
