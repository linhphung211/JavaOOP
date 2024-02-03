import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double n, m;
        System.out.printf("Nhap vao so thu nhat: ");
        n = sc.nextDouble();
        System.out.printf("Nhap vao so thu hai: ");
        m = sc.nextDouble();
        
        if (m > n) {
            System.out.println(+n +" la so be nhat!");
        }
        else if (m == n) {
            System.out.println("ko co so be nhat!");
            
        }
        else{
            System.out.println(+m +" la so be nhat");
        }

    }
}
