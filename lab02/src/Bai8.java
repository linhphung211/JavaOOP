import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n, x, tong = 0;
        double tbc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so lg phan tu trong day: ");
            n = sc.nextInt();
        }while (n < 0);
        int A[] = new int [n];
        for(int i = 1; i <= n; i++)
        {
            System.out.printf("A[%d]: ",i);
            x = sc.nextInt();
            tong = tong + x;
        }
            tbc = tong/n;
        System.out.println("trung binh cong cua day so do la: " +tbc);
    }
}
