import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Nhap so phan tu mang: ");
            n = sc.nextInt();
        }
        while (n < 0);
        int A[] = new int [n];
        System.out.println("Nhap vao cac phan tu mang");
        for(int i = 0  ; i < n ; i++)
        {
            System.out.printf("Phan tu thu %d :", i+1);
            A[i] = sc.nextInt();
        }
        double tong = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if (A[i] % 2 == 0) {
                tong = tong + A[i];
            }
        }
        System.out.println("Tong: " +tong);
    }
    
}
