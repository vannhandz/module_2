package ss1;

import java.util.Scanner;

public class Out_Lo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int x=0;
        for (int i = 0; i <n; i++) {
            int check=i;
            i=x;
            System.out.print((x=2*i+1)+" ");
            i=check;
        }
    }
}