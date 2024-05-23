import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListIntegers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            System.out.print("Nhap phan tu thu " + i + " : " );
            number = sc.nextInt();
            arrListIntegers.add(number);
        }
        
        int max = arrListIntegers.get(0);

        for (int j = 0; j < arrListIntegers.size(); j++) {
            if (arrListIntegers.get(j).compareTo(max) > 0) {
                max = arrListIntegers.get(j);
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max);
        System.out.println("Nhap vao 1 so nguyen : ");
        int m = sc.nextInt();
         for (int i = 0; i < arrListIntegers.size(); i++) {
                if (arrListIntegers.get(i) == m) {
                        arrListIntegers.remove(i);
                }
         }
        Collections.sort(arrListIntegers);
        System.out.println("Cac phan tu con lai trong mang la: ");
        showList(arrListIntegers);
        
    }
    
    public static void showList(ArrayList<Integer> list) {
        for (Integer obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }

    
    
}
