package ss1;

import java.util.Scanner;

public class Cb_3bai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        String str =String.valueOf(n);
        boolean flag = false;
        for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i) == str.charAt(str.length()-i-1)) {
                    flag = true;
                }
        }
        if (flag) {
            System.out.println("Doi xung");
        }else{
            System.out.println("Khong doi xung");
        }



        if(n%Math.sqrt(n)==0){
            System.out.println("Khong phai nguyen to");
        }else {
            System.out.println("la nguyen to");
        }
        int check=0;
        boolean flag1=false;
        for (int i = 0; i<n; i++) {
            check%=10;
            n/=10;
            if (check>n/10) {
                flag1=true;
            }
        }
        if (flag1) {
            System.out.println("ko tang");
        }else
            System.out.println("tang");

    }
}
