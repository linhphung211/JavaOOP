package model;
import until.config;

public class NhanVienPartTime extends Nvien {
    private int gioLamViec;
    public NhanVienPartTime(String ten, int gioLamViec)
    {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien()
    {
        return "Nhan vien PartTime";
    }
    public void tinhLuong()
    {
        luong = config.LUONG_NHAN_VIEN_PARTTIME_MOI_GIO *gioLamViec;
    }

}
