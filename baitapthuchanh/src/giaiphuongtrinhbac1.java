

import java.util.Scanner;

public class giaiphuongtrinhbac1 {
    public static void main(String[] args) {
    double x;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap a: ");
    double a = scanner.nextDouble();
    System.out.print("Nhap b: ");
    double b = scanner.nextDouble();
    x = -b/a;
    System.out.printf("Phuong trinh la: " +a +"x + " +b + "= 0");
            if (a == 0) {
                System.out.println("\nPhuong trinh vo nghiem! ");
            }
            else
            {
                System.out.println("\nPhuong trinh co nghiem la: " +x);
            }


    }
}