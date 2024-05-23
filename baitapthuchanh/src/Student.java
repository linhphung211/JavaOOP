import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String FullName;
    int Age;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin ho va ten: ");
        FullName = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Age = sc.nextInt();
    }
    public void HienThiThongTin()
    {
        System.out.print("Ho ten ban la: " + FullName);
        System.out.println("Tuoi cua ban la: " + Age);
    }
    public void ThemMoiThongTin()
    {
        
    }
    public void SuaThongTin()
    {

    }
    
}
