package model;
import until.config;

public class NhanVienFullTime extends Nvien {
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten)
    {
        this.ten = ten;
    }
    public NhanVienFullTime(String ten, int ngayLamThem)
    {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucVu )
    {
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien()
    {
        return "Nhan vien Fulltime";
    }
    public void tinhLuong()
    {
        if (loaiChucVu == config.NHAN_VIEN_SEP) {
            luong = config.LUONG_NHAN_VIEN_FULLTIME_SEP;
        }
        else if (loaiChucVu == config.NHAN_VIEN_LINH) {
            luong = config.LUONG_NHAN_VIEN_FULLTIME_LINH;
        }
    }
}   
