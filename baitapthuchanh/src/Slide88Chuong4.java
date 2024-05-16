import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88Chuong4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");
        // trong truong hop nay ta thay
        // key cua Quang Nam va Quang Ninh
        // deu la QN nen chuong trinh se them
        // vao trong hashMapCity valur dung sau (tuc la quang Ninh)
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "Thanh pho Ho Chi Minh");

        System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        
        // lay danh sach thanh pho co ma laf Qng
        // va hien thi ten Thanh pho
        System.out.println("QNg: " + hashMapCity.get("QNg"));

        // lay ten thanh pho co ma la NT
        //vi trong hashMapCity khong co thanh pho nao co ma la NT
        // => hien thi gia tri null
        System.out.println("NT: " + hashMapCity.get("NT"));

        // De kiem tra xem 1 value co trong hashMap hay khong
        // chung ta se dung phuong thuc containsValue()
        if (hashMapCity.containsValue("Thanh pho Ho Chi Minh")) {
            System.out.println("Co thanh pho HO Chi Minh trong hashMapCity");
        }
    }
}
