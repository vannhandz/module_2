package ss1;

import java.util.Scanner;

public class Ex_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            for (int i = 10; i<=99; i++) {
                int x=i%10;
                int y=i/10;
                int sum =x+y;
                int tich=x*y;
                if (tich==2*sum) {
                    System.out.print(i+" ");
                }
        }
    }
}
