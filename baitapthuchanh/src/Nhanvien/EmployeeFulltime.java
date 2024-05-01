package Nhanvien;
public class EmployeeFulltime extends Employee {
    
    public final int luongmoigio = 50000;
    public int luong;
    

    void EmployeeFulltime()
    {
        job = "Fulltime";
    }
    void Tinhluong()
    {
        if (ngay >= 25) {
            luong = luongmoigio *8 + 1000000;
            System.out.println("Luong thang la: " +luong+ " dong");
        }
        else
        {
            luong = luongmoigio *8;
            System.out.println("Luong thang la: " +luong+ " dong");
        }
    }

}
