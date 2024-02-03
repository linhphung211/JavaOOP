import java.util.Scanner;

public class giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        double nghiem1, nghiem2, nghiemkep;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        scanner.close();
        if (a == 0) {
            System.out.printf("Phuong trinh khong phai là phuong trinh bac 2");
            
        }
        if (a != 0) {
            System.out.printf("Phuong trinh la A = " +a +"x*x + " +b +"x + " +c + "=0 ");
            double delta = Math.pow(b, 2) - 4*a*c;
            if ( delta < 0) {
                System.out.println("\nPhuong trinh vo nghiem!"); 
                
            }
            else if (delta == 0) {
                nghiemkep= -b/2*a;
                System.out.printf("\nPhuong trinh co nghiem kep: " + nghiemkep);
            }
            else
            {
                nghiem1 = (-b+ Math.sqrt(delta)) / 2*a;
                nghiem2 = ( -b + Math.sqrt(delta)) / 2*a;
                System.out.println("\nPhuong trinh co 2 nghiem phan biet: x1 = "+ nghiem1 + "va x2 =" + nghiem2);
            }

        }
        
    }

}
