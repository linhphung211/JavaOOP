package Hinhhoc;
import java.util.Scanner;

public class HinhTron extends Hinhhoc {
  
    public float r;
    public HinhTron()
    {
        ten = "Hinh tron";
    }
    protected void nhapBanKinh()
    {
        System.out.print("Nhap vao ban kinh: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    void tinhChuVi()
    {
       chuVi = PI * 2 *r;
    }
    void tinhDienTich()
    {
        dienTich = PI * r * r;
    }
}
