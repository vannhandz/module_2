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
        boolean flag1 = true;
        if (n<2)
        {
            flag1 = false;
        }
        for (int i = 2; i <=n/2; i++) {
            if (n%i==0)
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            System.out.println("La nguyen to");
        }else {
            System.out.println("Khong phai nguyen to");
        }

        int check=0;
        boolean flag2=true;
        for (int i = 0; i<str.length()-1; i++) {
            if(str.charAt(i)>=str.charAt(i+1)){
                flag2=false;
                break;
            }
        }
        if (flag2) {
            System.out.println("tang");
        }else
            System.out.println("Khong tang");

    }
}
