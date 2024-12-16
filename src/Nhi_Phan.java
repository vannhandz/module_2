import java.util.Scanner;

public class Nhi_Phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        int cout =0;
        String check= "";
        for (int i = 0; n>0; i++) {
            cout=n%2;
            n/=2;
            check=cout+check;

        }
        System.out.print(check);
    }
}
