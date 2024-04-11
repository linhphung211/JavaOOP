package Nhanvien;
public class Main {
    public static void main(String[] args) {
        EmployeeFulltime ef = new EmployeeFulltime();
        ef.EmployeeFulltime();
        ef.NhapThongTinEmp();
        ef.XuatThongTinEmp();
        ef.Tinhluong();
        EmployeeParttime ep = new EmployeeParttime();
        ep.EmployeeParttime();
        ep.NhapThongTinEmp();
        ep.XuatThongTinEmp();
        ep.Tinhluong();
    }

}
