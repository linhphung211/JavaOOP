import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tich = 1;
        do
        {
            System.out.print("Nhap vao so nguyen duong: ");
            n = sc.nextInt();
        }
        while (n < 0);
        for(int i = 1; i <= n; i++)
        {
            tich = tich * i;
        }
        System.out.println("giai thua cua " +n +" la: " +tich);
    }

}
