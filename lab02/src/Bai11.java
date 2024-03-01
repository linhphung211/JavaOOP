import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang :");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+i+ ":");
            a[i] =sc.nextInt();
        }
        System.out.println("Mang ban dau la: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Mang sap xep :"+Arrays.toString(a));
    }
}
