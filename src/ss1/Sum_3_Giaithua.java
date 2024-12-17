package ss1;

import java.util.Scanner;

public class Sum_3_Giaithua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        System.out.print("Nhap B: ");
        int c = sc.nextInt();
        int check =1;
        int max= 0;
        int sum=0;
        if(a<b){
            max=b;
        }else if(a<c)
        {
            max=c;
        }else if(b<c)
        {
            max=c;
        }else
        {
            max=a;
        }
        int sumA=1, sumB=1,sumC=1;
        for (int i = 1; i <4; i++) {
            if(i<a)
            {
                sumA*=check;
            }
            if (i<b){
                sumB*=check;
            }
            if (i<c){
                sumC*=check;
            }
            check*=(2*i)*(2*i+1);
        }
        System.out.println(sum=sumA+sumB+sumC);
    }
}
