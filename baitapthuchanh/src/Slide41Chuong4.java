import java.util.LinkedList;
import java.util.Scanner;

public class Slide41Chuong4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //khai bao 1 dslk
        //luu tru cac thang trong nam
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");

        System.out.println("Nhap vao chi so phan tu can lay: ");
        int index = sc.nextInt();
        // kiem tra neu chi so lon hon hoac bang 0
        // va nho hon kich thuoc cua linklist - 1 thi moi lay
        //nguoc lai thong bao loi 
        if ((index < 0)||(index > (linkedList.size() - 1)))
        {
            System.out.println("Chi so can lay phai lon hon 0 va nho hon " + (linkedList.size()-1));
        }
        else
        {
            //truy cap ca phan tu chi so co trong LinkedList
            //vi linkedList co kieu la string
            //nen cac phan tu con cua no cung co kieu du lieu la String
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedList la" + node);

        }
        
        //truy cap phan tu dau tien trong danh sach
        //su dung phuong thuc getFirst()
        String firstNode = linkedList.getFirst();

        //truy cap phan tu dau tien trong danh sach
        //su dung phuong thuc getLast()
        String lastNode = linkedList.getLast();

        System.out.println("/nPhan tu dau tien trong danh sach la " + firstNode +
                " ; Phan tu cuoi cung trong danh sach la" + lastNode);
    }
}
