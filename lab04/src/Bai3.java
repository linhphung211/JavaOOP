import java.util.LinkedList;
import java.util.Scanner;

 class Sinhvien {
    private String HoTen;
    private float diem;

    public Sinhvien(String HoTen, float diem)
    {
        this.HoTen = HoTen;
        this.diem = diem;
    }
    public String getHoTen()
    {
        return HoTen;
    }
    public void setHoTen(String HoTen)
    {
        this.HoTen = HoTen;
    }
    public float getdiem()
    {
        return diem;
    }
    public void setdiem(float diem)
    {
        this.diem = diem;
    }
    @Override
    public String toString() {
        return "Student{Ho va ten =" + HoTen + "', diem =" + diem + "}";
    }
}
public class Bai3 {
    private LinkedList<Sinhvien> linkedList;

    public Bai3() {
        linkedList = new LinkedList<>();
    }
        
    public void ThemSinhVien(String HoTen, float diem) {
        linkedList.add(new Sinhvien(HoTen,diem));
            
    }
    public int demSinhVienThiLai() {
        int count = 0;
        for (Sinhvien sinhVien : linkedList) {
            if (sinhVien.getdiem() <= 5) {
                count++;
            }
        }
        return count;
    }
    public void hienThiSinhVienThiLai() {
        for (Sinhvien sinhVien : linkedList) {
            if (sinhVien.getdiem() <= 5) {
                System.out.println(sinhVien);
            }
        }
    }
    public void hienThiSinhVienDiemCaoNhat() {
        double diemCaoNhat = 0;
        for (Sinhvien sinhVien : linkedList) {
            if (sinhVien.getdiem() > diemCaoNhat) {
                diemCaoNhat = sinhVien.getdiem();
            }
        }

        for (Sinhvien sinhVien : linkedList) {
            if (sinhVien.getdiem() == diemCaoNhat) {
                System.out.println(sinhVien);
            }
        }
    }
    public Sinhvien timKiemSinhVienTheoTen(String ten) {
        for (Sinhvien sinhVien : linkedList) {
            if (sinhVien.getHoTen() == ten) {
                return sinhVien;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Bai3 Quanlysinhvien = new Bai3();
        Scanner sc = new Scanner(System.in);
        String HoTen;
        float diem;
        while (true) {
            System.out.println("Nhap ho ten (de trong de thoat): ");
            HoTen = sc.nextLine();
            if (HoTen.isEmpty()) {
                break;
            }
            System.out.println("Nhap diem: ");
            diem = sc.nextFloat();
            Quanlysinhvien.ThemSinhVien(HoTen, diem);

        }
        System.out.println("Danh sach sinh vien thi lai (diem <= 5):");
        System.out.println("So sinh vien thi lai la: " + Quanlysinhvien.demSinhVienThiLai());
        Quanlysinhvien.hienThiSinhVienThiLai();

        System.out.println("Sinh vien co diem cao nhat:");
        Quanlysinhvien.hienThiSinhVienDiemCaoNhat();

        System.out.print("Nhap ten sinh vien: ");
        String searchName = sc.nextLine();
        Quanlysinhvien.timKiemSinhVienTheoTen(searchName);
    }   
    
}


