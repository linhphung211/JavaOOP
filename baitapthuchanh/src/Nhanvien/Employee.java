package Nhanvien;
import java.util.Scanner;

public class Employee extends person {
    public String mnv;
    public String job;
    public int ngay;

    void NhapThongTinEmp()
    {
        NhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        mnv = sc.nextLine();
        System.out.println("Nhap so ngay lam viec trong 1 thang: ");
        ngay = sc.nextInt();
    }
    void XuatThongTinEmp()
    {
        XuatThongTin();
        System.out.println("Ma nhan vien la: " +mnv);
        System.out.println("Loai hinh cong viec cua nhan vien " +hoten+ " la: " +job+ " voi so ngay lam viec la: " +ngay );
        
    }
    
}
