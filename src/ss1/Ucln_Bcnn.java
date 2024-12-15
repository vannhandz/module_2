package ss1;

import java.util.Scanner;

public class Ucln_Bcnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        int ucln=0;
        int bcnn=0;
        for (int i = a; i>=1; i--) {
            if(a%i==0 && b%i==0) {
                ucln=i;
                bcnn=(a*b)/ucln;
                break;
            }
        }
        System.out.println("Ucln: "+ucln);
        System.out.println("Bcnn: "+bcnn);
    }
}
