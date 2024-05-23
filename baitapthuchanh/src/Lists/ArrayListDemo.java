package Lists;

import java.util.ArrayList;
import java.util.Scanner;
import Student.Student;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayListStudent = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Them \n2.Sua \n3.Xoa \n4.Hien thi thong tin");
            System.out.print("Xin hay chon: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Student st = new Student();
                    st.NhapThongTin();
                    arrayListStudent.add(st);
                    break;
                case 2:
                    System.out.println("Nhap vao ho ten can sua: ");
                    String Name;
                    for (Student student : arrayListStudent) {
                        if (student.getFullName() = Name) {
                            System.out.println("Nhap vao ho ten moi: ");
                            String NewFullName;
                            System.out.println("Nhap vao tuoi moi: ");
                            int newAge;
                            student.SuaThongTin(NewFullName,newAge);
                            break;
                            
                        }
                    }
                case 3:
                    System.out.println("Nhap ho ten de xoa");
                    String FullName = sc.nextLine();
                    for (Student student : arrayListStudent) {
                        if (student.getFullName == FullName) {
                            
                        }
                    }
                default:
                break;
            }
                
        }
    }
}

