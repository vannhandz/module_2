package ss1;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int sum=1;
        int x=0;
        int y=1;
        for (int i = 1; i <= n; i++) {
            sum=x+y;
            x=y;
            y=sum;
            System.out.print(sum+" ");
        }
    }
}
