import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Nhap so N: ");
        n = sc.nextInt();
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.printf("Tong cua cac chu so trong n la: " + sum);

    }
}
