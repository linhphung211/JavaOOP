import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.print("Nhap vao so nguyen: ");
            int n = sc.nextInt();
            sum += n;
        }while(sum < 100);
         System.out.println("Tong cac so nguyen vua nhap la: " +sum);
    }
}
