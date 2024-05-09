import java.util.ArrayList;

public class Slide23Chuong4 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<String>(3);

        colour.add("Red");
        colour.add("Blue");
        colour.add("Green");
        colour.add("Orange");
        colour.remove("Green");
        colour.add("Pink");
        colour.add("Yellow");

        System.out.println(colour.get(1));
        System.out.println(colour.contains("Orange"));
        System.out.println(colour.size());
        System.out.println(colour);
    }
}
