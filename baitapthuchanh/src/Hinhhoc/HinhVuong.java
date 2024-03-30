package Hinhhoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong()
    {
        ten = "hinh vuong";
    }
    public void NhapCanh()
    {
      System.out.print("Nhap vao canh: ");
      Scanner sc = new Scanner(System.in);
      dai = rong = sc.nextFloat();
    }
    
}
