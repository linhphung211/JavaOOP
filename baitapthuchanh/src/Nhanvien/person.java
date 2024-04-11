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
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("Nhap que quan: ");
        quequan = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioitinh = sc.nextLine();
    }
    void XuatThongTin()
    {
        System.out.print("Ho ten nhan vien: " +hoten);
        System.out.print("Ngay sinh:" +ngaysinh);
        System.out.print("Que nhan vien: " +quequan);
        System.out.print("Gioi tinh: " +gioitinh);

    }

}
