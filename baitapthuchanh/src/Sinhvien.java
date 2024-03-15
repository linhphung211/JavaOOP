import java.util.Scanner;

public class Sinhvien  {
    public static void main(String[] args) {
        Student st = new Sinhvien().new Student();
        st.Nhap();
        st.tinhdiem();
        st.Xuat();
    }
    class Student
    {
    String hoten;
    float toan;
    float ly;
    float hoa;
    float diemtong;
    Scanner sc = new Scanner(System.in);
    void Nhap()
    {
        
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap diem tong toan: ");
        toan = sc.nextFloat();
        System.out.print("Nhap diem tong ly: ");
        ly = sc.nextFloat();
        System.out.print("Nhap diem tong hoa: ");
        hoa = sc.nextFloat();
    }
    float tinhdiem()
    {
        
        diemtong = (toan + ly + hoa)/3;
        return diemtong;
    }
    void Xuat()
    {
        System.out.print("Ban " +hoten+ " co diem tong ket 3 mon la: " +diemtong);
    }

    }
}
