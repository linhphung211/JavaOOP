import java.util.Scanner;


public class Bai9 {
    public static void main(String[] args) {
        int kytuinhoa=0;
        int kytuthuong=0;
        int kytuso=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu :");
        String a = sc.nextLine();
        System.out.print("Cac ky tu trong chuoi la : ");

        for(int i=0;i<a.length();i++){
            char kytu = a.charAt(i);
            System.out.print(kytu);
           
            if(Character.isUpperCase(a.charAt(i))){
                kytuinhoa ++;
            }if(Character.isLowerCase(a.charAt(i))){
                kytuthuong ++;
            }if(Character.isDigit(a.charAt(i))){
                kytuso ++;
            }
            }
            System.out.println("\nSo ky tu in hoa la = " +kytuinhoa);
            System.out.println("So ky tu thuong la = " +kytuthuong);
            System.out.println("So ky tu so la = " +kytuso);
        }
    }
    

