package ss1;

import java.util.Scanner;

public class Out_Lo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int check=0;
        int space =1;
        for (int i = 2; i <= n; i+=2) {
            if (check==space)
            {
                System.out.print(-i+" ");
                space++;
                check=0;
            }else{
                System.out.print(i+" ");
                check++;
            }
        }
    }
}
