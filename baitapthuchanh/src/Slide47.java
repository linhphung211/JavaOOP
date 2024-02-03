import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        do {
            System.out.print("Nhap so nguyen n: ");
            n = sc.nextInt();
            sum = sum + n;
        } while (n < 100);
        System.out.println("Tong cac so vua nhap la: " +sum);
    }
    
}
