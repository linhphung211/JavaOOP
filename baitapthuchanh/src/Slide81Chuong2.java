import java.util.Scanner;

public class Slide81Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        do {
            System.out.print("Nhap so hang: ");
            m = sc.nextInt();
            System.out.print("Nhap so cot: ");
            n = sc.nextInt();

        } while (m < 0 && n < 0);
        int A[][] = new int[m][n];
        System.out.print("Nhap cac phan tu trong mang");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++ ){
            System.out.printf("A[%d][%d]",i ,j);
            A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++ ){
            if (max < A[i][j]) {
                max = A[i][j];
            }
            }
        }
        System.out.print("Phan tu lon nhat trong mang la: " +max);
    }
}
