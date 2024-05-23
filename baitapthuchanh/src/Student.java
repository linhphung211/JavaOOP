import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String FullName;
    private int Age;
    public Student (String FullName, int Age) 
    {
        this.FullName = FullName;
        this.Age = Age;
    }
    public String getFullName()
    {
        return FullName;
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge()
    {
        this.Age = Age;
    }
    public void setFullName()
    {
        this.FullName = FullName;
    }
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        FullName = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Age = sc.nextInt();
    }
    public void XuatThongTin()
    {
        System.out.print("Ho ten cua ban la: " + FullName);
        System.out.print("Tuoi cua ban la: " + Age);
    }
    public void ThemMoiThongTin()
    {
        NhapThongTin();
    }
    public void SuaThongTin(String newFullName, int newAge)
    {
        this.FullName = newFullName;
        this.Age = newAge;
    }
    
}
