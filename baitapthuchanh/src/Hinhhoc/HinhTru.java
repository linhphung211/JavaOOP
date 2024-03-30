package Hinhhoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float h;
    public HinhTru()
    {
        ten = "Hinh tru";
    }
    public void nhapChieuCao()
    { 
        System.out.print("Nhap vao chieu cao: ");
        Scanner sc = new Scanner(System.in);
        h = sc.nextFloat();
    }
    public void tinhTheTich()
    {   tinhDienTich();
        theTich = dienTich * h;
    }

}
