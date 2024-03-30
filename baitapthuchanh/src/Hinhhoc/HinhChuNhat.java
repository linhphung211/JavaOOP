package Hinhhoc;

import java.util.Scanner;

public class HinhChuNhat extends Hinhhoc {
    public float dai;
    public float rong;
    public HinhChuNhat()
    {
        ten = "Hinh chu nhat";
    }
    Scanner sc = new Scanner(System.in);
    public void nhapChieuDai()
    {
        System.out.print("Nhap vao chieu dai: ");
        dai = sc.nextFloat();
    }
    public void nhapChieuRong()
    {
        System.out.print("Nhap vao chieu rong: ");
        rong = sc.nextFloat();
    }
    public void tinhChuVi()
    {
        chuVi = 2 * ( dai + rong);
    }
    public void tinhDienTich()
    {
        dienTich = dai * rong ;
    }

}
