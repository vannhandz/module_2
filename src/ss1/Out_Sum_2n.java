package ss1;

import java.util.Scanner;

public class Out_Sum_2n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double check=1;
                for (int j = 1; j <= (2*i-1); j++) {
                    check*=j;
                }
            sum+=1.0/check;
        }
        System.out.println(sum);

    }
}
