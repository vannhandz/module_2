package ss1;

import java.util.Scanner;

public class Out_Chan_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 2; i <=n; i+=2) {
            if(i%3==0)
            {
                System.out.print(-i+" ");
            }else
            {
                System.out.print(i+" ");
            }

        }
    }
}
