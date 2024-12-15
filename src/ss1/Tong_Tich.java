package ss1;

import java.util.Scanner;

public class Tong_Tich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        int tich=1;
        for (int i = 1; n>0; i++) {
            int check=n%10;
            sum+=check;
            tich*=check;
            n/=10;
        }
        System.out.println("tong: "+sum);
        System.out.println("tich: "+tich);
    }
}
