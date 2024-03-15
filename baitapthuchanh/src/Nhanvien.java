import java.util.Scanner;

public class Nhanvien {
    public static void main(String[] args) {
        Employee ep = new Nhanvien().new Employee();
        ep.Nhap();
        ep.Tinhluong();
        ep.Xuat();
    }
    class Employee
    {
        String tenNV, maNV;
        int luong; 
        int chedo;
        Scanner sc = new Scanner(System.in);
        void Nhap()
        {
            System.out.print("Nhap ten nhan vien: ");
            tenNV = sc.nextLine();
            System.out.print("Nhap ma nhan vien: ");
            maNV = sc.nextLine();
           
        }
        void Tinhluong()
        {
                do
                {
                System.out.print("Ban muon lam part time hay full time (fulltime nhan 1, partime nhan 0): ");
                chedo = sc.nextInt();
                }
                while( chedo != 0&&chedo != 1);
            if (chedo == 1 ) {
                luong = 40000;
            }
            else if (chedo == 0){
                luong = 30000;
            }
            
        }
        void Xuat()
        {
            System.out.print("Ban " +tenNV+ " co ma nhan vien la " +maNV+ " se nhan duoc muc luong theo gio la " +luong);
        }
    }
}
