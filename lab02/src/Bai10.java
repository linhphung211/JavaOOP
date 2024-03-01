import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kytu;
        int count = 0;
        do
        {
        System.out.print("Nhap vao 1 chuoi ky tu: ");
        chuoi = sc.nextLine();
        } while ( chuoi.length() > 80);
        System.out.print("Nhap vao 1 ky tu: ");
        kytu = sc.next().charAt(0);
        for (int i =0; i < chuoi.length(); i++)
        {
            if (kytu == chuoi.charAt(i)) {
                count ++;
            }
        }
        System.out.println("ky tu " +kytu +"xuat hien " +count + "lan");
    }
}
