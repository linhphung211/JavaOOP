package model;
public class Nvien {
    
    protected String ten;
    protected long luong;

    public Nhanvien()
    {

    }
    public Nhanvien(string ten)
    {
        this.ten = ten;
    }
    protected String loaiNhanVien()
    {
       return ""; 
    }
    public xuatThongTin()
    {
        System.out.println("Ho ten nhan vien");
        System.out.println("Loai nhan vien: " +loaiNhanVien());
        System.out.println("Luong: " +luong);
    }

}