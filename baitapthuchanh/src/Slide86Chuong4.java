import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86Chuong4 {
    public static void main(String[] args) {
        //khai bao 1 HashMap co ten la hashMap
        //kieu du lieu cua key va value la String
        HashMap<String, String> hashMap = new HashMap<>();

        //Them value vao trong hashMap voi key tuong ung
        //su dung phuong thuc put()
        // doi so thu nhat trong put la key co kieu la String
        hashMap.put("CSLT", "Co so lap trinh");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");

        // tao 1 Set co ten la setHashMap
        // chua toan bo cac entry (vua key vua value)
        // cua hashMap
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Cac entry co trong setHashMap:");
        System.out.println(setHashMap);
    }
}
