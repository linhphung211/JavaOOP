package Nhanvien;
import java.util.Scanner;

public class person {
    
    public String hoten;
    public String ngaysinh;
    public String quequan;
    public String gioitinh;
    void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.print("Nhap que quan: ");
        quequan = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioitinh = sc.nextLine();
    }
    void XuatThongTin()
    {
        System.out.println("Ho ten nhan vien: " +hoten);
        System.out.println("Ngay sinh:" +ngaysinh);
        System.out.println("Que nhan vien: " +quequan);
        System.out.println("Gioi tinh: " +gioitinh);

    }

}
