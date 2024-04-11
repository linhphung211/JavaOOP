package Nhanvien;
import java.util.Scanner;

public class EmployeeParttime extends Employee {
    
    public final int luongmoigio = 25000;
    public int luong;
    public int sogio;

    void EmployeeParttime()
    {
        job = "Parttime";
    }
    void Tinhluong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so gio lam: ");
        sogio = sc.nextInt();
        if (sogio > 5) {
            luong = luongmoigio * sogio + 500000;
            System.out.println("Luong thang la: " +luong+ " dong");
        }
        else
        {
            luong = luongmoigio * sogio;
            System.out.println("Luong thang la: " +luong+ " dong");
        }
    }
}
