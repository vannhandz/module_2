package ss1;

import java.util.Scanner;

public class Ex__44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap A: ");
        int a = sc.nextInt();
        System.out.print("Nhap B: ");
        int b = sc.nextInt();
        int countDx=0,sumDx=0;
        int countCp=0,sumCp=0;
        int countNt=0,sumNt=0;
        for (int i = a; i <b; i++) {

            String str =String.valueOf(i);
            boolean flag = true;
            for (int j = 0; j < str.length()/2; j++) {
                if (str.charAt(j) != str.charAt(str.length()-j-1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {

                countDx++;
                sumDx+=i;
            }

            // chinh phuong
            if (i%Math.sqrt(i)==0)
            {
                countCp++;
                sumCp+=i;
            }
            boolean flag1 = true;

            //nguyen to
            if (i<2)
            {
                flag1 = false;
            }
            for (int j = 2; j <=i/2; j++) {
                if (i%j==0)
                {
                    flag1 = false;
                }
            }
            if (flag1)
            {

                countNt++;
                sumNt+=i;
            }

        }
        System.out.println("so doi xung    : "+countDx + " tong: "+sumDx);
        System.out.println("so chinh phuong: "+countCp + " tong: "+sumCp);
        System.out.println("so nguyen to   : "+countNt + " tong: "+sumNt);
    }
}
