import java.util.ArrayList;

public class Slide18Chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInterger = new ArrayList<>();
        arrListInterger.add(0);
        arrListInterger.add(7);
        arrListInterger.add(1);
        arrListInterger.add(9);
        System.out.println("Cac phan tu co trong arrListInterger la: ");
        for (Integer number : arrListInterger) {
            System.out.print(number + "\t");
        }
    }
}
