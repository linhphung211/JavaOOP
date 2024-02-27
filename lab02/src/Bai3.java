import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        int x;
        System.out.print("Nhap ten: ");
        n = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        x = sc.nextInt();
        if (x < 16) {
            System.out.printf("Ban " +n +" dang trong do tuoi vi thanh nien");
        }
        if (x >= 16) {
            System.out.printf("Ban " +n +" dang o do tuoi truong thanh");
        }
        if (x >= 18) {
            System.out.printf("Ban " +n +" da gia");
        }
    }
}
