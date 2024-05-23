import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhap vao so phan tu dslk");
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            linkedList.add(number);
        }
        int sum = 0, count = 0;
        for (int j = 0; j < linkedList.size(); j++) {
            if (linkedList.get(j) % 2 == 0) {
                sum = sum + linkedList.get(j);
                count ++;
            }
            
        }
        System.out.println("Trung binh cong cua day so la: " + sum /count);

        
    }
}

