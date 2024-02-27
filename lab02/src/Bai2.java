
    import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.printf("%d la so chan!",a);
        }
        else {
            System.out.printf("%d la so le!",a);
        }
    }

}
