import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double a, b, Tong, Hieu, Tich, Thuong, LayDu;
        System.out.print("Nhap vao so a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap vao so b: ");
        b = scanner.nextDouble();
        scanner.close();
        
        Tong = a + b;
        Hieu = a - b;
        Tich = a * b;
        Thuong = a / b;
        LayDu = a % b;
        System.out.println("Tong = " + Tong);
        System.out.println("Hieu = "+ Hieu);
        System.out.println("Tich = "+ Tich);
        System.out.println("Thuong = "+ Thuong);
        System.out.println("Chia lay phan du = "+ LayDu);
        if (a > b) {
            System.out.println(" a lon hon b! ");
        }
        else {
            System.out.println(" b lon hon a! ");
        }
    }
}
