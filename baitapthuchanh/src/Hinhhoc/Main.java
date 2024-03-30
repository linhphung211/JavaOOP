package Hinhhoc;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.NhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
        HinhTru htru = new HinhTru();
        htru.xuatTen();
        htru.nhapBanKinh();
        htru.nhapChieuCao();
        htru.tinhTheTich();
        htru.intheTich();
    }
}
