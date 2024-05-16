import java.util.LinkedList;

public class Slide39Chuong4 {
    public static void main(String[] args) {
        //khai bao 1 Linkedlist co ten la list
        //co kieu la String
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("vi du su dung phuong thuc addAll()");
        System.out.println("-----------------------------------");
        //them cac phan tu cua list vao listA
        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.println("listA:");
        showList(listA);
        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("-----------------------------------");
        //khoi tao listB
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        //xoa nhung phan tu thuoc listB khoi listA
        list.removeAll(listB);
        System.out.println("listA:");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc removeAll()");
        System.out.println("-----------------------------------");
        //xoa nhung phan tu thuoc listB khoi list
        list.removeAll(listB);
        System.out.println("list:");
        showList(list);


    }
    public static void showList(LinkedList<String> list) {
        //Show list through for-each
        for (String obj : list)
        {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
        
    }
}
