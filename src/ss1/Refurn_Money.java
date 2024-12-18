package ss1;

import java.util.Scanner;

public class Refurn_Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tien mon qua: ");
        int tienQua = sc.nextInt();
        System.out.print("Nhap tien tra: ");
        int tienTra = sc.nextInt();
        int tienThua=tienTra-tienQua;
        int cout=0;
        if(tienThua>0){
            System.out.println("Tien tra lai: ");
            int[] a={500000,200000,100000,50000,20000,10000,5000,2000,1000};
            for (int i=0;i<a.length;i++){
                cout +=tienThua / (a[i]);
                tienThua %= a[i];
                if(cout>0){
                    System.out.println(cout+" to: "+" "+a[i]);
                    cout=0;
                }
            }
        }else
        {
            System.out.println("khong du tien!");
        }
    }
}
